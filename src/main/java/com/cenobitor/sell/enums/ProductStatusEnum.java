package com.cenobitor.sell.enums;

import lombok.Getter;

/**
 * 状态
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 10:52 PM 2018/4/13
 * @Modified By:
 */
@Getter
public enum ProductStatusEnum implements CodeEnum<Integer>{
    UP(0,"在架"),
    DOWN(1,"下架");


    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
