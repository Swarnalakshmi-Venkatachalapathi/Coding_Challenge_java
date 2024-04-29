package com.model;

public class JobApplications {
	
private int ApplicationId;
private int JobId;
private int ApplicantID;
private String ApplicaionDate;
private String CoverLetter;
public JobApplications(int applicationId, int jobId, int applicantID, String applicaionDate, String coverLetter) {
	super();
	ApplicationId = applicationId;
	JobId = jobId;
	ApplicantID = applicantID;
	ApplicaionDate = applicaionDate;
	CoverLetter = coverLetter;
}
public JobApplications() {
	super();
	// TODO Auto-generated constructor stub
}
public int getApplicationId() {
	return ApplicationId;
}
public void setApplicationId(int applicationId) {
	ApplicationId = applicationId;
}
public int getJobId() {
	return JobId;
}
public void setJobId(int jobId) {
	JobId = jobId;
}
public int getApplicantID() {
	return ApplicantID;
}
public void setApplicantID(int applicantID) {
	ApplicantID = applicantID;
}
public String getApplicaionDate() {
	return ApplicaionDate;
}
public void setApplicaionDate(String applicaionDate) {
	ApplicaionDate = applicaionDate;
}
public String getCoverLetter() {
	return CoverLetter;
}
public void setCoverLetter(String coverLetter) {
	CoverLetter = coverLetter;
}
@Override
public String toString() {
	return "JobApplications [ApplicationId=" + ApplicationId + ", JobId=" + JobId + ", ApplicantID=" + ApplicantID
			+ ", ApplicaionDate=" + ApplicaionDate + ", CoverLetter=" + CoverLetter + "]";
}

}
