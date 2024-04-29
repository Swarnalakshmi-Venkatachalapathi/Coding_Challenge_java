package com.model;

public class Applicants {
private int ApplicantId;
private String FirstName;
private String LastName;
private String Email;
private String Phone;
private String Resume;
public Applicants(int applicantId, String firstName, String lastName, String email, String phone, String resume) {
	super();
	ApplicantId = applicantId;
	FirstName = firstName;
	LastName = lastName;
	Email = email;
	Phone = phone;
	Resume = resume;
}
public Applicants() {
	super();
	// TODO Auto-generated constructor stub
}
public int getApplicantId() {
	return ApplicantId;
}
public void setApplicantId(int applicantId) {
	ApplicantId = applicantId;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public String getResume() {
	return Resume;
}
public void setResume(String resume) {
	Resume = resume;
}
@Override
public String toString() {
	return "Applicants [ApplicantId=" + ApplicantId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email="
			+ Email + ", Phone=" + Phone + ", Resume=" + Resume + "]";
}



}
