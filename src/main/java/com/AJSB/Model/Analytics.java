package com.AJSB.Model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Analytics {
	
	 public int total;
	    public int search_time;
	    public ArrayList<Root> events;
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public int getSearch_time() {
			return search_time;
		}
		public void setSearch_time(int search_time) {
			this.search_time = search_time;
		}
		public ArrayList<Root> getEvents() {
			return events;
		}
		public void setEvents(ArrayList<Root> events) {
			this.events = events;
		}
		
	    
	}

