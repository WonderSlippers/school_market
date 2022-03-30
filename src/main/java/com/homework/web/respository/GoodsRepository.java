package com.homework.web.respository;

import com.homework.web.pojo.Goods;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
	@Query(value = "select * from goods where category_id = :category_id", nativeQuery = true)
	List<Goods> selectByCategory_id(@Param(value = "category_id") Integer category_id);

	@Query(value = "select * from goods where approved = :approved", nativeQuery = true)
	List<Goods> selectByApproved(@Param(value = "approved") boolean approved);

	@Query(value = "SELECT goods.* FROM goods LEFT OUTER JOIN recommend ON goods.id=recommend.goods_id WHERE goods.insert_date>:day GROUP BY goods.id ORDER BY goods.multiplier*(SELECT COUNT(id) FROM recommend WHERE goods_id=goods.id)+goods.addend DESC LIMIT :limit_count", nativeQuery = true)
	List<Goods> selectByRank(@Param(value = "day") String day, @Param(value = "limit_count") Integer limit_count);

	@Query(value = "select * from goods where user_id = :user_id", nativeQuery = true)
	List<Goods> selectByUser_id(@Param(value = "user_id") Integer user_id);

	@Query(value = "select * from novel where name like %:name%", nativeQuery = true)
	List<Goods> selectByLikeName(@Param(value = "name") String name);

	@Query(value = "SELECT goods.* FROM goods WHERE goods.id = ANY(SELECT collection.goods_id FROM collection WHERE collection.user_id = :user_id)", nativeQuery = true)
	List<Goods> selectByUser_idOfCollection(@Param(value = "user_id") Integer user_id);
	
	@Query(value = "SELECT goods.* FROM goods WHERE goods.id = ANY(SELECT recommend.goods_id FROM recommend WHERE recommend.user_id = :user_id)", nativeQuery = true)
	List<Goods> selectByUser_idOfRecommend(@Param(value = "user_id") Integer user_id);


}
