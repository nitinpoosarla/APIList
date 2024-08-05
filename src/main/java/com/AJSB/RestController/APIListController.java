package com.AJSB.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AJSB.Model.APIList;
import com.AJSB.Model.FetchDate;
import com.AJSB.Model.ProviderInfoRequest;
import com.AJSB.Model.ProviderInfoResponse;
import com.AJSB.Model.Root;
import com.AJSB.Repo.APIRepo;
import com.AJSB.Service.APIListImpl;

@RestController
@RequestMapping("/ajsb")
public class APIListController {
	
	@Autowired
	private APIListImpl apiListImpl;
	
	@Autowired
	private APIRepo apiRepo;
	
	@GetMapping("/providers/{apiname}")
	 public ResponseEntity<List<Root>> getAPIByName(@PathVariable String apiname)
	 {
		 
		 return ResponseEntity.ok(apiRepo.findByApiName(apiname));
	 }

	
	
	@PostMapping("/apiTransactions")
	public ResponseEntity<Map<String, Object>> getAPITran(@RequestBody FetchDate fd)
	{
		
	//	return ResponseEntity.ok(apiListImpl.getAPIList1(fd.getStartDateField(),fd.getEndDateField()));
		
	return ResponseEntity.ok(apiListImpl.getAPIListPagination(fd.getApiName(),fd.getStartDateField(), 
															 fd.getEndDateField(), fd.getPageNo(),
															 fd.getPageSize()));
	}
	
	
@GetMapping("/apiList")
	 public ResponseEntity<List<APIList>> getAPIList()
	 {
		 
		 return ResponseEntity.ok(apiListImpl.getAllAPIList());
	 }
	
	@GetMapping("/apiListProviders")
	 public ResponseEntity<List<String>> getAPIListProviders()
	 {
		 
		 return ResponseEntity.ok(apiListImpl.getAllProvidersList());
	 }
	
	@GetMapping("/apiAPIListProviders/{provider}")
	 public ResponseEntity<List<String>> getAPIListByProvider(@RequestParam String provider)
	 {
		 
		 return ResponseEntity.ok(apiListImpl.getAllAPIsList(provider));
	 }

	@GetMapping("/apiList/{apiname}")
	 public ResponseEntity<APIList> getAPIListByName(@RequestParam String apiname)
	 {
		 
		 return ResponseEntity.ok(apiListImpl.getAPIList(apiname));
	 }
	
	
	
	@PostMapping("/apiListCreate")
	public ResponseEntity<String> insertAPI(@RequestBody APIList apilist)
	{
		
		return ResponseEntity.ok(apiListImpl.saveAPIList(apilist));
	}
	
@PutMapping("/apiListUpdate")
	public ResponseEntity<String> updateAPI(@RequestBody APIList apilist,String apiName)
	{
		
		return ResponseEntity.ok(apiListImpl.updateAPIList(apiName,apilist));
	}

		@PostMapping("/entity")
		public ResponseEntity<ProviderInfoResponse> entityInfo(@RequestBody ProviderInfoRequest a)
		{
	
			return ResponseEntity.ok(apiListImpl.EntityInfo(a));
		}
	
	
}
