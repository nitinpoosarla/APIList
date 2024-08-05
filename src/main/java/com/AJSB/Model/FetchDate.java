package com.AJSB.Model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FetchDate {
	 private String  startDateField;
	 private String  endDateField;
	 private String apiName;
	 private int  pageNo;
	 private int  pageSize;   
}
