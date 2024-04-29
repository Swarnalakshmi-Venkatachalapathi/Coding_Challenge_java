package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.JobListings;

public interface JobListingsDao {

	List<JobListings> findAll() throws SQLException;

	int save(JobListings jobl)throws SQLException;

	List<JobListings> findAll(int companyid)throws SQLException;

}
