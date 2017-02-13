package com.sample.maven.dao;

import javax.sql.DataSource;

public class CommonDAO {

	private  DataSource dataSource = null;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}
