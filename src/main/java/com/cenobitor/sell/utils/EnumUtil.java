package com.cenobitor.sell.utils;

import com.cenobitor.sell.enums.CodeEnum;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 6:27 PM 2018/4/17
 * @Modified By:
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code,Class<T> enumClass){
        for (T each: enumClass.getEnumConstants()){
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
