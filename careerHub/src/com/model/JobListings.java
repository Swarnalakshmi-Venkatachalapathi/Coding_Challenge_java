package com.model;

public class JobListings {

	private int jobId;
	private int complanyId;
	private String jobTitle;
	private String jobDescription;
	private String jobLocation;
	private double Salary;
	private String JobType;
	private String postedDate;
	public JobListings(int jobId, int complanyId, String jobTitle, String jobDescription, String jobLocation,
			double salary, String jobType, String postedDate) {
		super();
		this.jobId = jobId;
		this.complanyId = complanyId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		Salary = salary;
		JobType = jobType;
		this.postedDate = postedDate;
	}
	public JobListings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getComplanyId() {
		return complanyId;
	}
	public void setComplanyId(int complanyId) {
		this.complanyId = complanyId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getJobType() {
		return JobType;
	}
	public void setJobType(String jobType) {
		JobType = jobType;
	}
	public String getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return "JobListings [jobId=" + jobId + ", complanyId=" + complanyId + ", jobTitle=" + jobTitle
				+ ", jobDescription=" + jobDescription + ", jobLocation=" + jobLocation + ", Salary=" + Salary
				+ ", JobType=" + JobType + ", postedDate=" + postedDate + "]";
	}
	
	
	
}
