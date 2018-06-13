package com.cenobitor.sell.exception;

import com.cenobitor.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 2:54 PM 2018/4/14
 * @Modified By:
 */
@Getter
public class SellException extends RuntimeException {

    private Integer code;
    private String message;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
