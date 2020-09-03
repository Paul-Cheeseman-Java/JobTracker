package com.demo.JobTracker;

//import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JobReed {

	String jobId;
	String employerId;
	String employerName;
	String employerProfileId;
	String employerProfileName;
	String jobTitle;
	String locationName;
	String minimumSalary;
	String maximumSalary;
	String currency;
	String expirationDate;
	String date;
	String jobDescription;
	String applications;
	String jobUrl;
	
	public JobReed() {
		
	}
	
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getEmployerId() {
		return employerId;
	}
	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerProfileId() {
		return employerProfileId;
	}
	public void setEmployerProfileId(String employerProfileId) {
		this.employerProfileId = employerProfileId;
	}
	public String getEmployerProfileName() {
		return employerProfileName;
	}
	public void setEmployerProfileName(String employerProfileName) {
		this.employerProfileName = employerProfileName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getMinimumSalary() {
		return minimumSalary;
	}
	public void setMinimumSalary(String minimumSalary) {
		this.minimumSalary = minimumSalary;
	}
	public String getMaximumSalary() {
		return maximumSalary;
	}
	public void setMaximumSalary(String maximumSalary) {
		this.maximumSalary = maximumSalary;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getApplications() {
		return applications;
	}
	public void setApplications(String applications) {
		this.applications = applications;
	}
	public String getJobUrl() {
		return jobUrl;
	}
	public void setJobUrl(String jobUrl) {
		this.jobUrl = jobUrl;
	}
	
	
}
