package com.AJSB.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection ="apilist")
public class APIList {
	
	private String no;
	private String productName;
	private String apiName;
	private String catalog;
	private String operations;
	private String operationsCount;
	private String apiComplexity;
	private String serviceType;
	private String providers;
	private String consumer;
}
