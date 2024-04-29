package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.JobApplications;

public interface JobApplicationsDao {
int save(JobApplications jobA) throws SQLException;

List<JobApplications> findAll(int jobid) throws SQLException;
	

}
