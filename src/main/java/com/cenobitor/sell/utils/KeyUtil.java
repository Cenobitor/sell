package com.cenobitor.sell.utils;

import java.util.Random;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 3:09 PM 2018/4/14
 * @Modified By:
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式:时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();

         Integer number = random.nextInt(900000) + 100000;
         return System.currentTimeMillis()+String.valueOf(number);
    }

}
