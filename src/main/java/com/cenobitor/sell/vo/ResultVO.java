package com.cenobitor.sell.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:26 PM 2018/4/13
 * @Modified By:
 */
@Data
public class ResultVO<T> implements Serializable{

    private static final long serialVersionUID = 8960474786737581150L;

    /**
     * 错误码
     */
    private Integer code;
    /**
     *提示信息
     */
    private String msg;
    /**
     * 具体内容
     */
    private T data;

}
