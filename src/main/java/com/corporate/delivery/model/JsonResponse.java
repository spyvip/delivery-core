package com.corporate.delivery.model;

public class JsonResponse {
	
	private String status = "200";
	private String result;
	
	public JsonResponse() {
		
	}
	
	public JsonResponse(String status,  String result){
		this.status = status;
		this.result = result;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}


}
