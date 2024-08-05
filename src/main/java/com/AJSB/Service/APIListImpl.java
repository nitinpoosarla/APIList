package com.AJSB.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.AJSB.Model.APIList;
import com.AJSB.Model.ProviderInfoRequest;
import com.AJSB.Model.ProviderInfoResponse;
import com.AJSB.Model.Root;
import com.AJSB.Repo.APIListRepo;
import com.AJSB.Repo.APIRepo;

@Service
public class APIListImpl {
	
	@Autowired
	private APIListRepo apiListRepo;
	
	@Autowired
	private APIRepo apiRepo;
	
	public List<Root> getAPIList1(String startDate,String endDate)
	{
		System.out.println("start date  :::"+startDate);
		List<Root> r=apiRepo.findByDatetimeAfter(startDate);
		System.out.println("r size ::"+r.size());
		return r;
	}
	//Pagination
	public Map<String, Object> getAPIListPagination(String apiName,String startDate,String endDate,int pageNo,int pageSize)
	{
		System.out.println("start date  :::"+startDate);
		System.out.println("end date  :::"+endDate);
		System.out.println("pageNo and pageSize  :::"+pageNo +" :::" +pageSize);
		System.out.println("api name ::: "+apiName);
		 //create pagerequest object
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
        
		Page<Root> p=apiRepo.findByDatetimeBetweenAndApiName(startDate,endDate,apiName,pageRequest);
		List<Root> r=p.getContent();
		Map<String, Object> response = new HashMap<>();
	      response.put("Root", r);
	      response.put("currentPage", p.getNumber());
	      response.put("totalItems", p.getTotalElements());
	      response.put("totalPages", p.getTotalPages());
		System.out.println("r size ::"+r.size());
		return response;
	}
	
	
	public List<APIList> getAllAPIList()
	{		
		List<APIList> apilist=apiListRepo.findAll();
		return apilist;		
	}
	//List of Providers
	public List<String> getAllProvidersList()
	{
		List<String> ll=new ArrayList<>();
		List<APIList> AP =apiListRepo.findAll();		
		for (int i = 0; i < AP.size(); i++) {
		   ll.add(AP.get(i).getProviders()); // Assuming "stringValue" is the field name
		}      		
		Set<String> uniqueStrings = new HashSet(ll);
		List<String> uniqueStringList = new ArrayList<>(uniqueStrings);
		return uniqueStringList;
	}
	
	//List of APIs based on providers
	public List<String> getAllAPIsList(String provider)
	{
		List<String> ll=new ArrayList<>();
		List<APIList> AP =apiListRepo.findByProviders(provider);
		for (int i = 0; i < AP.size(); i++) {
		   ll.add(AP.get(i).getApiName()); // Assuming "stringValue" is the field name
		}      		
		Set<String> uniqueStrings = new HashSet(ll);
		List<String> uniqueStringList = new ArrayList<>(uniqueStrings);
		return uniqueStringList;
	}
	
	
	public APIList getAPIList(String apiName)
	{
		APIList apilist=apiListRepo.findByApiName(apiName);
		return apilist;
		
	}
	
	public String saveAPIList(APIList apiList)
	{
		APIList apilist=apiListRepo.save(apiList);
		return  "inserted succesfully";
		
	}
	
	public String updateAPIList(String apiname,APIList apiListRequest)
	{
		APIList apilist=apiListRepo.findByApiName(apiname);
		if(Objects.nonNull(apilist))
		{
			apiListRepo.deleteByApiName(apiname);
			APIList apilist1=apiListRepo.save(apiListRequest);
			
		}
		return "updated succesfully";
	}
	
	public ProviderInfoResponse EntityInfo(ProviderInfoRequest providerInfoRequest) {
	
		APIList apilist=apiListRepo.findByApiName(providerInfoRequest.getApiName());
		ProviderInfoResponse i=new ProviderInfoResponse();
		if(Objects.nonNull(apilist))
		{			
			i.setProviderInfo(apilist.getProviders());	
		}
		return i;
		
	}
	

}
