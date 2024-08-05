package com.AJSB.Repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.AJSB.Model.APIList;
import com.AJSB.Model.Demo;
import com.AJSB.Model.Root;

//Root
public interface APIRepo extends MongoRepository<Root,Integer> {
	
	
	//List<Root> findByDatetimeBetween(LocalDateTime startDate, LocalDateTime endDate);
	@Query("{'datetime' : { '$lt' : ?0}}")
	List<Root> findByDatetimeAfter(String startDate);
	//timestamp //datetime
	@Query("{ 'api_name' : ?0 }")
	List<Root> findByApiName(String apiname);
	
	//{"datetime":{"$lt":"2024-01-01T04:10:00.651","$gt":"2024-01-01T04:09:00.651"}}
	@Query("{'datetime' : { '$lt' : ?0,'$gt' : ?1}}")
	List<Root> findByDatetimeBetween(String startDate,String endDate);
	
	//pagination {"datetime":{"$lt":"2024-01-01T04:10:00.651","$gt":"2024-01-01T04:09:00.651"}}
	@Query("{'datetime' : { '$gte' : ?0,'$lte' : ?1},'api_name' : ?2}")
	Page<Root> findByDatetimeBetweenAndApiName(String startDate,String endDate,String apiName,Pageable pageable);

}
