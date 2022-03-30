package com.homework.web.respository;

import com.homework.web.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	@Query(value = "select * from category where rank = :rank", nativeQuery = true)
	List<Category> selectByRank(@Param(value = "rank") Integer rank);

	@Query(value = "select * from category where parent_id = :parent_id", nativeQuery = true)
	List<Category> selectByParent_id(@Param(value = "parent_id") Integer parent_id);

	@Query(value = "select * from category where rank = :rank and parent_id = :parent_id", nativeQuery = true)
	List<Category> selectByRankParent_id(@Param(value = "rank") Integer rank,
			@Param(value = "parent_id") Integer parent_id);

	@Query(value = "select * from category where parent_id = :parent_id and name=:name", nativeQuery = true)
	Category selectByParent_idName(@Param(value = "parent_id") Integer parent_id, @Param(value = "name") String name);
}
