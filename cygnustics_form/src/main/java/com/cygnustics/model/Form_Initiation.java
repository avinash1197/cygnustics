package com.cygnustics.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Form_Initiation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long formId;
	private String describeProblem;
	private String initiatedBy;
	private String department;
	private String riskLevel;
	private String assignedDepartment;
	private String assignedTo;
	private Date assignedDate;

	public Form_Initiation() {
		super();
	}

	public Form_Initiation(String describeProblem, String initiatedBy, String department, String riskLevel,
			String assignedDepartment, String assignedTo, Date assignedDate) {
		super();
		this.describeProblem = describeProblem;
		this.initiatedBy = initiatedBy;
		this.department = department;
		this.riskLevel = riskLevel;
		this.assignedDepartment = assignedDepartment;
		this.assignedTo = assignedTo;
		this.assignedDate = assignedDate;
	}

	public Long getFormId() {
		return formId;
	}

	public void setFormId(Long formId) {
		this.formId = formId;
	}

	public String getDescribeProblem() {
		return describeProblem;
	}

	public void setDescribeProblem(String describeProblem) {
		this.describeProblem = describeProblem;
	}

	public String getInitiatedBy() {
		return initiatedBy;
	}

	public void setInitiatedBy(String initiatedBy) {
		this.initiatedBy = initiatedBy;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getAssignedDepartment() {
		return assignedDepartment;
	}

	public void setAssignedDepartment(String assignedDepartment) {
		this.assignedDepartment = assignedDepartment;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	@Override
	public String toString() {
		return "Form_Initiation [formId=" + formId + ", describeProblem=" + describeProblem + ", initiatedBy="
				+ initiatedBy + ", department=" + department + ", riskLevel=" + riskLevel + ", assignedDepartment="
				+ assignedDepartment + ", assignedTo=" + assignedTo + ", assignedDate=" + assignedDate + "]";
	}

}
