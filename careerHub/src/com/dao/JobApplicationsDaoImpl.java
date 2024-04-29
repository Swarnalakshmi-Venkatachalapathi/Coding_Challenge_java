package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.JobApplications;
import com.model.JobListings;
import com.utitlity.DBConfig;

public class JobApplicationsDaoImpl implements JobApplicationsDao{

	@Override
	public int save(JobApplications jobA) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConfig.dbConnect();
		String sql = "INSERT INTO JobApplications (Application_id, Job_iD, Applicant_id, Application_date, Cover_letter) values (?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, jobA.getApplicationId());
		pstmt.setInt(2, jobA.getJobId());
		pstmt.setInt(3, jobA.getApplicantID());
		pstmt.setString(4, jobA.getApplicaionDate());
		pstmt.setString(5, jobA.getCoverLetter());
		int status = pstmt.executeUpdate(); 
		DBConfig.dbClose();
		
		return status;

	}

	@Override
	public List<JobApplications> findAll(int jobid) throws SQLException {
		Connection con = DBConfig.dbConnect();
		String sql = "select * from JobApplications where Job_iD=? ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, jobid);
		ResultSet rst = pstmt.executeQuery();
		List<JobApplications> list = new ArrayList<>();
		while(rst.next()==true) {
		
			int ApplicationId = rst.getInt("Application_id");
			int JobId= rst.getInt("Job_iD");
			int ApplicantId= rst.getInt("Applicant_id");
			String ApplicationDate = rst.getString("Application_date");
			String CoverLetter = rst.getString("Cover_letter");
		
			
			
			JobApplications jobApplications = new JobApplications(ApplicationId,JobId,ApplicantId,ApplicationDate,CoverLetter);
			list.add(jobApplications);
		}
		DBConfig.dbClose();
		return list;
	}

}

//Application_id, Job_iD, Applicant_id, Application_date, Cover_letter
