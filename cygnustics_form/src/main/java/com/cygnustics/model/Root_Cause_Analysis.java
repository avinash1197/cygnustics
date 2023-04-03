package com.cygnustics.model;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Root_Cause_Analysis {

	@Id
	private Long formId;
	private String rootCauseCategory;
	private String performedBy;
	private String detailsOfInvestigation;
	private String rootCauseMethodlogy;
	private String assignedTo;
	private String assignedDepartment;
	private Date dueDate;

	public Root_Cause_Analysis() {
		super();
	}

	public Root_Cause_Analysis(String rootCauseCategory, String performedBy, String detailsOfInvestigation,
			String rootCauseMethodlogy, String assignedTo, String assignedDepartment, Date dueDate) {
		super();
		this.rootCauseCategory = rootCauseCategory;
		this.performedBy = performedBy;
		this.detailsOfInvestigation = detailsOfInvestigation;
		this.rootCauseMethodlogy = rootCauseMethodlogy;
		this.assignedTo = assignedTo;
		this.assignedDepartment = assignedDepartment;
		this.dueDate = dueDate;
	}

	public Long getFormId() {
		return formId;
	}

	public void setFormId(Long formId) {
		this.formId = formId;
	}

	public String getRootCauseCategory() {
		return rootCauseCategory;
	}

	public void setRootCauseCategory(String rootCauseCategory) {
		this.rootCauseCategory = rootCauseCategory;
	}

	public String getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(String performedBy) {
		this.performedBy = performedBy;
	}

	public String getDetailsOfInvestigation() {
		return detailsOfInvestigation;
	}

	public void setDetailsOfInvestigation(String detailsOfInvestigation) {
		this.detailsOfInvestigation = detailsOfInvestigation;
	}

	public String getRootCauseMethodlogy() {
		return rootCauseMethodlogy;
	}

	public void setRootCauseMethodlogy(String rootCauseMethodlogy) {
		this.rootCauseMethodlogy = rootCauseMethodlogy;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getAssignedDepartment() {
		return assignedDepartment;
	}

	public void setAssignedDepartment(String assignedDepartment) {
		this.assignedDepartment = assignedDepartment;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Root_Cause_Analysis [formId=" + formId + ", rootCauseCategory=" + rootCauseCategory + ", performedBy="
				+ performedBy + ", detailsOfInvestigation=" + detailsOfInvestigation + ", rootCauseMethodlogy="
				+ rootCauseMethodlogy + ", assignedTo=" + assignedTo + ", assignedDepartment=" + assignedDepartment
				+ ", dueDate=" + dueDate + "]";
	}

}
