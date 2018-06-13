package com.cenobitor.sell.service.impl;

import com.cenobitor.sell.dto.OrderDTO;
import com.cenobitor.sell.service.OrderService;
import com.cenobitor.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 1:02 PM 2018/4/17
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {

    @Autowired
    private PayService payService;
    @Autowired
    private OrderService orderService;

    @Test
    public void create() throws Exception{
        OrderDTO orderDTO = orderService.findOne("1523717090478261680");

        payService.create(orderDTO);

    }

    @Test
    public void refund(){
        OrderDTO orderDTO = orderService.findOne("1523717090478261680");
        payService.refund(orderDTO);
    }
}