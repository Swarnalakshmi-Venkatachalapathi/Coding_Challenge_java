package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Applicants;

public interface ApplicantsDao {

	int save(Applicants app) throws SQLException;

	List<Applicants> findAll()throws SQLException;

	

}
