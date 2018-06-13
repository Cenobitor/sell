package com.cenobitor.sell.service.impl;

import com.cenobitor.sell.dataobject.SellerInfo;
import com.cenobitor.sell.repository.SellerInfoRepository;
import com.cenobitor.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:43 PM 2018/4/17
 * @Modified By:
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        SellerInfo sellerInfo = repository.findByOpenid(openid);
        return sellerInfo;
    }

    @Override
    public void saveSellerInfo(SellerInfo sellerInfo) {
        repository.save(sellerInfo);
    }
}
