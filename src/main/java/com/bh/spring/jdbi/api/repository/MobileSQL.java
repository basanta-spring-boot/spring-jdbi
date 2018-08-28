package com.bh.spring.jdbi.api.repository;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import com.bh.spring.jdbi.api.model.Mobile;

@RegisterMapper(MobileMapper.class)
public interface MobileSQL {

	@SqlQuery("select * from Mobile")
	List<Mobile> list();

	@SqlUpdate("insert into Mobile (model_name,price)" + " values(:model_name,:price) ")
	@GetGeneratedKeys
	Integer insert(@BindBean Mobile mobile);

	@SqlQuery("SELECT * FROM Mobile WHERE price = :price")
	abstract List<Mobile> get(@Bind("price") int price);
}
