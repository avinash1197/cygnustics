package com.cygnustics.response;

public class ResponseData {
	private String responseCode;
	private String responseDesc;

	public ResponseData() {
		super();
	}

	public ResponseData(String responseCode, String responseDesc) {
		super();
		this.responseCode = responseCode;
		this.responseDesc = responseDesc;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

	@Override
	public String toString() {
		return "ResponseData [responseCode=" + responseCode + ", responseDesc=" + responseDesc + "]";
	}

}
