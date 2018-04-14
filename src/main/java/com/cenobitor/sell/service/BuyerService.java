package com.cenobitor.sell.service;

import com.cenobitor.sell.dto.OrderDTO;

/**
 * 买家
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:55 PM 2018/4/14
 * @Modified By:
 */
public interface BuyerService {
    /**
     * 查询一个订单
     */
    OrderDTO findOrderOne(String openid,String orderId);

    /**
     * 取消订单
     */
    OrderDTO cancelOrderOne(String openid,String orderId);

}
