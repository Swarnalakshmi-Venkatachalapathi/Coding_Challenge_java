package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Companies;
import com.model.JobListings;
import com.utitlity.DBConfig;

public class CompaniesDaoImpl implements CompaniesDao {

	@Override
	public List<Companies> findAll() throws SQLException {
		Connection con = DBConfig.dbConnect();
		String sql = "select * from Companies";
PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rst = pstmt.executeQuery();
		List<Companies> list = new ArrayList<>();
		while(rst.next()==true) {
			int companyid = rst.getInt("Company_id");
			String companyname = rst.getString("Company_name");
			String Location = rst.getString("Location");
			
			Companies companies = new Companies(companyid,companyname,Location);
			list.add(companies);
		}
		DBConfig.dbClose();
		return list;
	}
		
	}


//Company_id, Company_name, Location