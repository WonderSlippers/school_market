package com.homework.web.repository;

import com.homework.web.pojo.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CollectionRepository extends JpaRepository<Collection, Integer> {
	@Query(value = "select * from collection where user_id = :user_id and goods_id=:goods_id", nativeQuery = true)
	Collection selectByUser_idgoods_id(@Param(value = "user_id") Integer user_id,
			@Param(value = "goods_id") Integer goods_id);

	@Query(value = "select * from collection where goods_id=:goods_id", nativeQuery = true)
	List<Collection> selectBygoods_id(@Param(value = "goods_id") Integer goods_id);

	@Query(value = "select * from collection where user_id=:user_id", nativeQuery = true)
	List<Collection> selectByUser_id(@Param(value = "user_id") Integer user_id);
}
