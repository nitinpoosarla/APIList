package com.AJSB.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AJSB.Model.APIList;



public interface APIListRepo extends MongoRepository<APIList,Integer>{
	
	APIList findByApiName(String apiName);
	
	void deleteByApiName(String apiName);

}
