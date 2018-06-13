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
public enum PayStatusEnum implements CodeEnum<Integer>{
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
