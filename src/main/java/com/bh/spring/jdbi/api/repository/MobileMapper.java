package com.bh.spring.jdbi.api.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.bh.spring.jdbi.api.model.Mobile;

public class MobileMapper implements ResultSetMapper<Mobile> {

	@Override
	public Mobile map(int index, ResultSet r, StatementContext ctx) throws SQLException {
		return new Mobile(r.getInt("id"), r.getString("model_name"), r.getInt("price"));
		
	}

}
