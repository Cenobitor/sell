package com.cenobitor.sell.repository;


import com.cenobitor.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 1:34 PM 2018/4/14
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "1223";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerPhone("12345678911");
        orderMaster.setBuyerAddress("深圳宝安");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(2.7));
        OrderMaster master = repository.save(orderMaster);
        Assert.assertNotNull(master);
    }

    @Test
    public void findByBuyerOpenid() {
        Pageable pageable = new PageRequest(0,1);
        Page<OrderMaster> page = repository.findByBuyerOpenid(OPENID, pageable);
        Assert.assertNotEquals(0,page.getContent().size());
        System.out.println(page.getTotalElements());
    }
}