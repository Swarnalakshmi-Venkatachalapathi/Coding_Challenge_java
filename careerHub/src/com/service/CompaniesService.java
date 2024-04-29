package com.service;

import java.sql.SQLException;
import java.util.List;
import com.dao.*;
import com.model.Companies;

public class CompaniesService {
CompaniesDao dao = new CompaniesDaoImpl();
	public List<Companies> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
