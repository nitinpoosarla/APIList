package com.AJSB.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AJSB.Model.APIList;
import com.AJSB.Service.APIListImpl;

@RestController
@RequestMapping("/ajsb")
public class APIListController {
	
	@Autowired
	private APIListImpl apiListImpl;
	
	
	@GetMapping("/apiList")
	 public ResponseEntity<List<APIList>> getAPIList()
	 {
		 
		 return ResponseEntity.ok(apiListImpl.getAllAPIList());
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
	
	
}
