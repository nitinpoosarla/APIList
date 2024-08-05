package com.AJSB.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Headers{
    public String request_method;
    public String x_client_ip;
    public String organization;
    public String request_path;
    public Object http_accept;
    public String content_type;
    public String content_length;
    public String http_host;
    public String via;
    public Object http_user_agent;
    public String http_version;
    public String connection;
    public String x_global_transaction_id;
	public String getRequest_method() {
		return request_method;
	}
	public void setRequest_method(String request_method) {
		this.request_method = request_method;
	}
	public String getX_client_ip() {
		return x_client_ip;
	}
	public void setX_client_ip(String x_client_ip) {
		this.x_client_ip = x_client_ip;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getRequest_path() {
		return request_path;
	}
	public void setRequest_path(String request_path) {
		this.request_path = request_path;
	}
	public Object getHttp_accept() {
		return http_accept;
	}
	public void setHttp_accept(Object http_accept) {
		this.http_accept = http_accept;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public String getContent_length() {
		return content_length;
	}
	public void setContent_length(String content_length) {
		this.content_length = content_length;
	}
	public String getHttp_host() {
		return http_host;
	}
	public void setHttp_host(String http_host) {
		this.http_host = http_host;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public Object getHttp_user_agent() {
		return http_user_agent;
	}
	public void setHttp_user_agent(Object http_user_agent) {
		this.http_user_agent = http_user_agent;
	}
	public String getHttp_version() {
		return http_version;
	}
	public void setHttp_version(String http_version) {
		this.http_version = http_version;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public String getX_global_transaction_id() {
		return x_global_transaction_id;
	}
	public void setX_global_transaction_id(String x_global_transaction_id) {
		this.x_global_transaction_id = x_global_transaction_id;
	}
    
}
