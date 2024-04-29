package com.model;

public class Companies {

	private int companyId;
	private String CompanyName;
	private String Location;
	public Companies(int companyId, String companyName, String location) {
		super();
		this.companyId = companyId;
		CompanyName = companyName;
		Location = location;
	}
	public Companies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Companies [companyId=" + companyId + ", CompanyName=" + CompanyName + ", Location=" + Location + "]";
	}
	
	
}
