package com.cenobitor.sell.dto;

import com.cenobitor.sell.dataobject.OrderDetail;
import com.cenobitor.sell.enums.OrderStatusEnum;
import com.cenobitor.sell.enums.PayStatusEnum;
import com.cenobitor.sell.utils.serializer.Date2LongSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 2:42 PM 2018/4/14
 * @Modified By:
 */
@Data
//忽略空的字段
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /**订单id*/
    private String orderId;

    /**买家名字*/
    private String buyerName;

    /**买家手机号*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家微信Openid*/
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态 */
    private Integer orderStatus;

    /** 订单支付状态 */
    private Integer payStatus;

    /** 创建时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** 更新时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

}
