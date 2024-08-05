package com.AJSB.Model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Document(collection ="data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root{
	@Id
	private String id;
    public String request_method;
    public String plan_name;
    public ArrayList<LatencyInfo> latency_info;
    public String request_protocol;
    public String developer_org_id;
    public String request_body;
    public String host;
    public String developer_org_title;
    public String org_id;
    public String api_id;
    public String space_id;
    public String endpoint_url;
    public ArrayList<String> tags;
    public ArrayList<ResponseHttpHeader> response_http_headers;
    public String gateway_ip;
    public String status_code;
    public String client_id;
    public String product_title;
    public String datetime;
    public String resource_path;
    @JsonProperty("api_name") 
    public String apiName;
    public String product_name;
    public String transaction_id;
    public RateLimit rate_limit;
    @JsonProperty("@version") 
    public String version;
    public ArrayList<Object> query_string;
    public String org_name;
    public int bytes_sent;
    public String app_name;
    public ArrayList<Object> debug;
    public String client_ip;
    public String app_type;
    public String resource_id;
    public String api_version;
    public String http_user_agent;
    public Billing billing;
    public String catalog_id;
    public String developer_org_name;
    public String product_id;
    @JsonProperty("@timestamp") 
    public LocalDateTime timestamp;
    public String plan_id;
    public Headers headers;
    public String immediate_client_ip;
    public String space_name;
    public int time_to_serve_request;
    public String uri_path;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String catalog_name;
    public String app_id;
    public String response_body;
    public int bytes_received;
    public String product_version;
    public String plan_version;
    public ArrayList<RequestHttpHeader> request_http_headers;
    public String log_policy;
	public String getRequest_method() {
		return request_method;
	}
	public void setRequest_method(String request_method) {
		this.request_method = request_method;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public ArrayList<LatencyInfo> getLatency_info() {
		return latency_info;
	}
	public void setLatency_info(ArrayList<LatencyInfo> latency_info) {
		this.latency_info = latency_info;
	}
	public String getRequest_protocol() {
		return request_protocol;
	}
	public void setRequest_protocol(String request_protocol) {
		this.request_protocol = request_protocol;
	}
	public String getDeveloper_org_id() {
		return developer_org_id;
	}
	public void setDeveloper_org_id(String developer_org_id) {
		this.developer_org_id = developer_org_id;
	}
	public String getRequest_body() {
		return request_body;
	}
	public void setRequest_body(String request_body) {
		this.request_body = request_body;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getDeveloper_org_title() {
		return developer_org_title;
	}
	public void setDeveloper_org_title(String developer_org_title) {
		this.developer_org_title = developer_org_title;
	}
	public String getOrg_id() {
		return org_id;
	}
	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}
	public String getApi_id() {
		return api_id;
	}
	public void setApi_id(String api_id) {
		this.api_id = api_id;
	}
	public String getSpace_id() {
		return space_id;
	}
	public void setSpace_id(String space_id) {
		this.space_id = space_id;
	}
	public String getEndpoint_url() {
		return endpoint_url;
	}
	public void setEndpoint_url(String endpoint_url) {
		this.endpoint_url = endpoint_url;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public ArrayList<ResponseHttpHeader> getResponse_http_headers() {
		return response_http_headers;
	}
	public void setResponse_http_headers(ArrayList<ResponseHttpHeader> response_http_headers) {
		this.response_http_headers = response_http_headers;
	}
	public String getGateway_ip() {
		return gateway_ip;
	}
	public void setGateway_ip(String gateway_ip) {
		this.gateway_ip = gateway_ip;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getResource_path() {
		return resource_path;
	}
	public void setResource_path(String resource_path) {
		this.resource_path = resource_path;
	}
	public String getApi_name() {
		return apiName;
	}
	public void setApi_name(String api_name) {
		this.apiName = api_name;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public RateLimit getRate_limit() {
		return rate_limit;
	}
	public void setRate_limit(RateLimit rate_limit) {
		this.rate_limit = rate_limit;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public ArrayList<Object> getQuery_string() {
		return query_string;
	}
	public void setQuery_string(ArrayList<Object> query_string) {
		this.query_string = query_string;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public int getBytes_sent() {
		return bytes_sent;
	}
	public void setBytes_sent(int bytes_sent) {
		this.bytes_sent = bytes_sent;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public ArrayList<Object> getDebug() {
		return debug;
	}
	public void setDebug(ArrayList<Object> debug) {
		this.debug = debug;
	}
	public String getClient_ip() {
		return client_ip;
	}
	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}
	public String getApp_type() {
		return app_type;
	}
	public void setApp_type(String app_type) {
		this.app_type = app_type;
	}
	public String getResource_id() {
		return resource_id;
	}
	public void setResource_id(String resource_id) {
		this.resource_id = resource_id;
	}
	public String getApi_version() {
		return api_version;
	}
	public void setApi_version(String api_version) {
		this.api_version = api_version;
	}
	public String getHttp_user_agent() {
		return http_user_agent;
	}
	public void setHttp_user_agent(String http_user_agent) {
		this.http_user_agent = http_user_agent;
	}
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	public String getCatalog_id() {
		return catalog_id;
	}
	public void setCatalog_id(String catalog_id) {
		this.catalog_id = catalog_id;
	}
	public String getDeveloper_org_name() {
		return developer_org_name;
	}
	public void setDeveloper_org_name(String developer_org_name) {
		this.developer_org_name = developer_org_name;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	public Headers getHeaders() {
		return headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public String getImmediate_client_ip() {
		return immediate_client_ip;
	}
	public void setImmediate_client_ip(String immediate_client_ip) {
		this.immediate_client_ip = immediate_client_ip;
	}
	public String getSpace_name() {
		return space_name;
	}
	public void setSpace_name(String space_name) {
		this.space_name = space_name;
	}
	public int getTime_to_serve_request() {
		return time_to_serve_request;
	}
	public void setTime_to_serve_request(int time_to_serve_request) {
		this.time_to_serve_request = time_to_serve_request;
	}
	public String getUri_path() {
		return uri_path;
	}
	public void setUri_path(String uri_path) {
		this.uri_path = uri_path;
	}
	public String getCatalog_name() {
		return catalog_name;
	}
	public void setCatalog_name(String catalog_name) {
		this.catalog_name = catalog_name;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	public String getResponse_body() {
		return response_body;
	}
	public void setResponse_body(String response_body) {
		this.response_body = response_body;
	}
	public int getBytes_received() {
		return bytes_received;
	}
	public void setBytes_received(int bytes_received) {
		this.bytes_received = bytes_received;
	}
	public String getProduct_version() {
		return product_version;
	}
	public void setProduct_version(String product_version) {
		this.product_version = product_version;
	}
	public String getPlan_version() {
		return plan_version;
	}
	public void setPlan_version(String plan_version) {
		this.plan_version = plan_version;
	}
	public ArrayList<RequestHttpHeader> getRequest_http_headers() {
		return request_http_headers;
	}
	public void setRequest_http_headers(ArrayList<RequestHttpHeader> request_http_headers) {
		this.request_http_headers = request_http_headers;
	}
	public String getLog_policy() {
		return log_policy;
	}
	public void setLog_policy(String log_policy) {
		this.log_policy = log_policy;
	}
    
    
}
