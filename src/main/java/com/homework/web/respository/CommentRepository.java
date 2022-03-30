package com.homework.web.respository;

import com.homework.web.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
	@Query(value = "select * from comment where goods_id=:goods_id", nativeQuery = true)
	List<Comment> selectBygoods_id(@Param(value = "goods_id") Integer goods_id);

	@Query(value = "select * from comment where user_id=:user_id", nativeQuery = true)
	List<Comment> selectByUser_id(@Param(value = "user_id") Integer user_id);

	@Query(value = "select * from comment where user_id=:user_id and goods_id=:goods_id", nativeQuery = true)
	List<Comment> selectByUser_idgoods_id(@Param(value = "user_id") Integer user_id,
			@Param(value = "goods_id") Integer goods_id);
}
