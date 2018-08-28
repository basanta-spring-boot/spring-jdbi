package com.bh.spring.jdbi.api.repository;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import com.bh.spring.jdbi.api.model.Mobile;

@Repository
public class MobileDAO {

	@Qualifier("dataSource")
	@Autowired
	private DataSource dataSource;

	public int addMobile(Mobile mobile) {
		Connection conn = DataSourceUtils.getConnection(dataSource);
		Handle handle = DBI.open(conn);
		MobileSQL mobileSQL = handle.attach(MobileSQL.class);
		return mobileSQL.insert(mobile);
	}

	public List<Mobile> getAllMobiles() {
		Connection conn = DataSourceUtils.getConnection(dataSource);
		Handle handle = DBI.open(conn);
		MobileSQL mobileSQL = handle.attach(MobileSQL.class);
		return mobileSQL.list();
	}

	public List<Mobile> getMobiles(int price) {
		Connection conn = DataSourceUtils.getConnection(dataSource);
		Handle handle = DBI.open(conn);
		MobileSQL mobileSQL = handle.attach(MobileSQL.class);
		return mobileSQL.get(price);
	}
}
