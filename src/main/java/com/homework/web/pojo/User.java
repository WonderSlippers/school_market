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
@ApiModel(description = "用户")
public class User  extends AbstractAuditingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@ApiModelProperty("主键，自增")
	Integer id;
	@Column
	@ApiModelProperty("角色，ADMIN为管理员，VIP1为普通会员")
	String role;
	@Column
	@ApiModelProperty("用户名")
	String username;
	@Column
	@ApiModelProperty("密码")
	String password;
	@Column
	@ApiModelProperty("昵称")
	String nickname;
	@Column
	@ApiModelProperty("盐值")
	String salt;
	@Column
	@ApiModelProperty("头像")
	String image;
	@Column
	@ApiModelProperty("不合格商品数")
	int unqualified_goods;

}
