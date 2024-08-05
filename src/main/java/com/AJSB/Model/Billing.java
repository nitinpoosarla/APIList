package com.AJSB.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Billing{
    public String currency;
    public String provider;
    public int amount;
    public String model;
    public int trial_period_days;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getTrial_period_days() {
		return trial_period_days;
	}
	public void setTrial_period_days(int trial_period_days) {
		this.trial_period_days = trial_period_days;
	}
    
    
    
}
