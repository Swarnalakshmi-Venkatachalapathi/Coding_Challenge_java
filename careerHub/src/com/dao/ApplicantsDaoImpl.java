package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Applicants;
import com.model.JobListings;
import com.utitlity.DBConfig;

public class ApplicantsDaoImpl implements ApplicantsDao {

	@Override
	public int save(Applicants app) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConfig.dbConnect();
		String sql = "INSERT INTO Applicants (Applicant_id, First_name, Last_name, Email, Phone, Resume)"
				+ "VALUES(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,app.getApplicantId());
		pstmt.setString(2, app.getFirstName());
		pstmt.setString(3, app.getLastName());
		pstmt.setString(4, app.getEmail());
		pstmt.setString(5, app.getPhone());
		pstmt.setString(6, app.getResume());
		
		
		
		int status = pstmt.executeUpdate(); 
		DBConfig.dbClose();
		
		return status;

	}

	@Override
	public List<Applicants> findAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConfig.dbConnect();
		String sql = "select * from Applicants ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rst = pstmt.executeQuery();
		List<Applicants> list = new ArrayList<>();
		while(rst.next()==true) {
			//Applicant_id, First_name, Last_name, Email, Phone, Resume
			int ApplicantId = rst.getInt("Applicant_id");
			String fname = rst.getString("First_name");
			String lname = rst.getString("Last_name");
			String email = rst.getString("Email");
			String Phone = rst.getString("Phone");
			String Resume = rst.getString("Resume");
			Applicants appli = new Applicants(ApplicantId,fname,lname,email,Phone,Resume);
			list.add(appli);
		}
		DBConfig.dbClose();
		return list;
	}

}
