package com.AJSB.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AJSB.Model.APIList;



public interface APIListRepo extends MongoRepository<APIList,Integer>{
	
	APIList findByApiName(String apiName);
	
	void deleteByApiName(String apiName);
	
	List<APIList> findByProviders(String providerName);
	
	
}
