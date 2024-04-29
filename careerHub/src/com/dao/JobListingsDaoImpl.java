package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.JobListings;
import com.utitlity.DBConfig;

public class JobListingsDaoImpl implements JobListingsDao  {

	@Override
	public List<JobListings> findAll() throws SQLException {
		Connection con = DBConfig.dbConnect();
		String sql = "select * from JobListings ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rst = pstmt.executeQuery();
		List<JobListings> list = new ArrayList<>();
		while(rst.next()==true) {
		
			int jobId = rst.getInt("Job_iD");
			int CompanyId= rst.getInt("Company_iD");
			String JobTitle = rst.getString("Job_title");
			String JobDescription = rst.getString("Job_description");
			String JobLocation = rst.getString("Job_location");
			double salary = rst.getDouble("Salary");
			String JobType = rst.getString("Job_type");
			String PostedDate = rst.getString("Posted_date");
			
			
			JobListings JobListing = new JobListings(jobId,CompanyId,JobTitle,JobDescription,JobLocation,salary,JobType,PostedDate);
			list.add(JobListing);
		}
		DBConfig.dbClose();
		return list;
	}

	@Override
	public int save(JobListings jobl) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConfig.dbConnect();
		String sql = "INSERT INTO JobListings (Job_iD, Company_iD, Job_title, Job_description, Job_location, Salary, Job_type, Posted_date)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, jobl.getJobId());
		pstmt.setInt(2, jobl.getComplanyId());
		pstmt.setString(3, jobl.getJobTitle());
		pstmt.setString(4, jobl.getJobDescription());
		pstmt.setString(5, jobl.getJobLocation());
		pstmt.setDouble(6, jobl.getSalary());
		pstmt.setString(7, jobl.getJobType());
		pstmt.setString(8, jobl.getPostedDate());

		int status = pstmt.executeUpdate(); 
		DBConfig.dbClose();
		
		return status;
	}

	@Override
	public List<JobListings> findAll(int companyid) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConfig.dbConnect();
		String sql = "select * from JobListings where Company_iD=? ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, companyid);
		ResultSet rst = pstmt.executeQuery();
		List<JobListings> list = new ArrayList<>();
		while(rst.next()==true) {
		
			int jobId = rst.getInt("Job_iD");
			int CompanyId= rst.getInt("Company_iD");
			String JobTitle = rst.getString("Job_title");
			String JobDescription = rst.getString("Job_description");
			String JobLocation = rst.getString("Job_location");
			double salary = rst.getDouble("Salary");
			String JobType = rst.getString("Job_type");
			String PostedDate = rst.getString("Posted_date");
			
			
			JobListings JobListing = new JobListings(jobId,CompanyId,JobTitle,JobDescription,JobLocation,salary,JobType,PostedDate);
			list.add(JobListing);
		}
		DBConfig.dbClose();
		return list;
	
	}


}
