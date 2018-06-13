package com.cenobitor.sell.service.impl;

import com.cenobitor.sell.dataobject.SellerInfo;
import com.cenobitor.sell.utils.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:46 PM 2018/4/17
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

    @Autowired
    private SellerServiceImpl sellerService;

    @Test
    public void findSellerInfoByOpenid() {
        SellerInfo sellerInfoByOpenid = sellerService.findSellerInfoByOpenid("abc");
        Assert.assertEquals("abc",sellerInfoByOpenid.getOpenid());
    }

    @Test
    public void saveSellerInfo() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setId(KeyUtil.getUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");
        sellerService.saveSellerInfo(sellerInfo);
    }
}