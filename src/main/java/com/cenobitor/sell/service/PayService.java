package com.cenobitor.sell.service;

import com.cenobitor.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 12:24 PM 2018/4/17
 * @Modified By:
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);


    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
