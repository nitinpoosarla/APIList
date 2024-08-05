package com.AJSB.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RateLimit{
   @JsonProperty("default")
   //@JsonIgnoreProperties(ignoreUnknown = true)
    public Default mydefault;

	public Default getMydefault() {
		return mydefault;
	}

	public void setMydefault(Default mydefault) {
		this.mydefault = mydefault;
	}
    
}
