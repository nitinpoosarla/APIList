package com.AJSB.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestHttpHeader{
    @JsonProperty("Authorization") 
    public String authorization;
    @JsonProperty("Content-Type") 
    public String contentType;
    @JsonProperty("Accept") 
    public String accept;
    @JsonProperty("Host") 
    public String host;
    @JsonProperty("Content-Length") 
    public String contentLength;
    @JsonProperty("X-Forwarded-For") 
    public String xForwardedFor;
    @JsonProperty("Via") 
    public String via;
    @JsonProperty("X-Client-IP") 
    public String xClientIP;
    @JsonProperty("X-Global-Transaction-ID") 
    public String xGlobalTransactionID;
	public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
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
	public String getxGlobalTransactionID() {
		return xGlobalTransactionID;
	}
	public void setxGlobalTransactionID(String xGlobalTransactionID) {
		this.xGlobalTransactionID = xGlobalTransactionID;
	}
    
    
    
}
