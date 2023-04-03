package com.cygnustics.response;

public class Form_Initiation_Response {
	private String responseMessage;
	private Long formInitiationId;
	private ResponseData responseData;

	public Form_Initiation_Response() {
		super();
	}

	public Form_Initiation_Response(String responseMessage, Long formInitiationId, ResponseData responseData) {
		super();
		this.responseMessage = responseMessage;
		this.formInitiationId = formInitiationId;
		this.responseData = responseData;
	}

	public Long getFormInitiationId() {
		return formInitiationId;
	}

	public void setFormInitiationId(Long formInitiationId) {
		this.formInitiationId = formInitiationId;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public ResponseData getResponseData() {
		return responseData;
	}

	public void setResponseData(ResponseData responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "Form_Initiation_Response [responseMessage=" + responseMessage + ", formInitiationId=" + formInitiationId
				+ ", responseData=" + responseData + "]";
	}

}
