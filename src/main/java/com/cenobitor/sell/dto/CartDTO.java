package com.cenobitor.sell.dto;

import lombok.Data;

/**
 * 购物车
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 3:20 PM 2018/4/14
 * @Modified By:
 */
@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
