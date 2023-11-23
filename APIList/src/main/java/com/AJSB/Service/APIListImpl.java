package com.AJSB.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AJSB.Model.APIList;
import com.AJSB.Repo.APIListRepo;

@Service
public class APIListImpl {
	
	@Autowired
	private APIListRepo apiListRepo;
	
	public List<APIList> getAllAPIList()
	{		
		List<APIList> apilist=apiListRepo.findAll();
		return apilist;		
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
	

}
