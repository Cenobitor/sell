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
public enum OrderStatusEnum implements CodeEnum<Integer>{
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
