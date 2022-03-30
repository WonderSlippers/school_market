package com.homework.web.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
@JsonIgnoreProperties(value = { "hibernateLazyInitializer" })
@ApiModel(description = "商品")
public class Goods extends AbstractAuditingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@ApiModelProperty("主键，自增")
	Integer id;
	@Column
	@ApiModelProperty("用户的id")
	Integer user_id;
	@Column
	@ApiModelProperty("商品价格")
	double price;
	@Column
	@ApiModelProperty("审核情况")
	boolean approved;
	@Column
	@ApiModelProperty("分类的id")
	Integer category_id;
	@Column
	@ApiModelProperty("名称")
	String name;
	@Column
	@ApiModelProperty("简介")
	String summary;
	@Column
	@ApiModelProperty("详情介绍")
	String detail;
	@Column
	@ApiModelProperty("图片")
	String image;
	@Column
	@ApiModelProperty("出售情况")
	Boolean is_sold;
	@Column
	@ApiModelProperty("点击数")
	int click_amount;
	@Column
	@ApiModelProperty("上架时间")
	String time;
	@Column
	@ApiModelProperty("乘数，用于推荐排序，默认值为10000")
	Integer multiplier;
	@Column
	@ApiModelProperty("加数，用于推荐排序，默认值为0。排序值为：推荐数*乘数+加数")
	Integer addend;
}
