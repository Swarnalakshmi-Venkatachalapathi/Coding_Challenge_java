package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Companies;

public interface CompaniesDao {

	List<Companies> findAll()throws SQLException;

}
