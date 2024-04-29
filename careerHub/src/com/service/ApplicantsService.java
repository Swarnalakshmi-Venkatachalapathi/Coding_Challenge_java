package com.service;

import com.model.Applicants;

import java.sql.SQLException;
import java.util.List;

import com.dao.*;
public class ApplicantsService {
ApplicantsDao dao = new ApplicantsDaoImpl();
	public int save(Applicants app) throws SQLException {
		// TODO Auto-generated method stub
		return dao.save(app);
	}
	public List<Applicants> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
