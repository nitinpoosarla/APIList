package com.AJSB.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseHttpHeader{
    @JsonProperty("Content-Type") 
    public String contentType;
    @JsonProperty("Date") 
    public String date;
    @JsonProperty("X-Global-Transaction-ID") 
    public String xGlobalTransactionID;
    @JsonProperty("Accept") 
    public String accept;
    @JsonProperty("Content-Length") 
    public String contentLength;
    @JsonProperty("X-Forwarded-For") 
    public String xForwardedFor;
    @JsonProperty("Via") 
    public String via;
    @JsonProperty("X-Client-IP") 
    public String xClientIP;
    @JsonProperty("Access-Control-Expose-Headers") 
    public String accessControlExposeHeaders;
    @JsonProperty("Access-Control-Allow-Origin") 
    public String accessControlAllowOrigin;
    @JsonProperty("Access-Control-Allow-Methods") 
    public String accessControlAllowMethods;
    @JsonProperty("X-RateLimit-Limit") 
    public String xRateLimitLimit;
    @JsonProperty("X-RateLimit-Remaining") 
    public String xRateLimitRemaining;
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getxGlobalTransactionID() {
		return xGlobalTransactionID;
	}
	public void setxGlobalTransactionID(String xGlobalTransactionID) {
		this.xGlobalTransactionID = xGlobalTransactionID;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getContentLength() {
		return contentLength;
	}
	public void setContentLength(String contentLength) {
		this.contentLength = contentLength;
	}
	public String getxForwardedFor() {
		return xForwardedFor;
	}
	public void setxForwardedFor(String xForwardedFor) {
		this.xForwardedFor = xForwardedFor;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getxClientIP() {
		return xClientIP;
	}
	public void setxClientIP(String xClientIP) {
		this.xClientIP = xClientIP;
	}
	public String getAccessControlExposeHeaders() {
		return accessControlExposeHeaders;
	}
	public void setAccessControlExposeHeaders(String accessControlExposeHeaders) {
		this.accessControlExposeHeaders = accessControlExposeHeaders;
	}
	public String getAccessControlAllowOrigin() {
		return accessControlAllowOrigin;
	}
	public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
		this.accessControlAllowOrigin = accessControlAllowOrigin;
	}
	public String getAccessControlAllowMethods() {
		return accessControlAllowMethods;
	}
	public void setAccessControlAllowMethods(String accessControlAllowMethods) {
		this.accessControlAllowMethods = accessControlAllowMethods;
	}
	public String getxRateLimitLimit() {
		return xRateLimitLimit;
	}
	public void setxRateLimitLimit(String xRateLimitLimit) {
		this.xRateLimitLimit = xRateLimitLimit;
	}
	public String getxRateLimitRemaining() {
		return xRateLimitRemaining;
	}
	public void setxRateLimitRemaining(String xRateLimitRemaining) {
		this.xRateLimitRemaining = xRateLimitRemaining;
	}
    
    
    
}
