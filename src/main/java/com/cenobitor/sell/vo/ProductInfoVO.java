package com.cenobitor.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品详情
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:38 PM 2018/4/13
 * @Modified By:
 */
@Data
public class ProductInfoVO implements Serializable {

    private static final long serialVersionUID = -858684544688362407L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;


}
