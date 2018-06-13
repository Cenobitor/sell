package com.cenobitor.sell.service;

import com.cenobitor.sell.dto.OrderDTO;

/**
 * @Author: Cenobitor
 * @Description: 推送消息
 * @Date: Created in 11:30 AM 2018/4/18
 * @Modified By:
 */
public interface PushMessageService {

    void orderStatus(OrderDTO orderDTO);
}
