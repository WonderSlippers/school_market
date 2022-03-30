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
@ApiModel(description = "订单")
public class Order extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @ApiModelProperty("主键，自增")
    Integer id;
    @Column
    @ApiModelProperty("出售用户的id")
    Integer solder_id;
    @Column
    @ApiModelProperty("购买用户的id")
    Integer buyer_id;
    @Column
    @ApiModelProperty("订单的id")
    Integer order_id;
    @Column
    @ApiModelProperty("下单时间")
    String time;
    @Column
    @ApiModelProperty("购买人姓名")
    String buyer_name;
    @Column
    @ApiModelProperty("联系电话")
    String phone_number;

}
