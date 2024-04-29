package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.JobListingsDao;
import com.dao.JobListingsDaoImpl;
import com.model.JobListings;

public class JobListingService {
JobListingsDao dao = new JobListingsDaoImpl();
	public List<JobListings> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	public int save(JobListings jobl) throws SQLException {
		// TODO Auto-generated method stub
		return dao.save(jobl);
	}
	public List<JobListings> findAll(int companyid) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll(companyid);
	}

}
