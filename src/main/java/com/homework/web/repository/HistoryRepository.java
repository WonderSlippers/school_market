package com.homework.web.repository;

import com.homework.web.pojo.Collection;
import com.homework.web.pojo.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Integer> {
	@Query(value = "select * from history where user_id = :user_id and goods_id=:goods_id", nativeQuery = true)
	Collection selectByUser_idgoods_id(@Param(value = "user_id") Integer user_id,
			@Param(value = "goods_id") Integer goods_id);

	@Query(value = "select * from history where goods_id=:goods_id", nativeQuery = true)
	List<Collection> selectBygoods_id(@Param(value = "goods_id") Integer goods_id);

	@Query(value = "select * from history where user_id=:user_id", nativeQuery = true)
	List<Collection> selectByUser_id(@Param(value = "user_id") Integer user_id);


}
