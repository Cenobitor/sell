package com.cenobitor.sell.service;

import com.cenobitor.sell.dataobject.SellerInfo;

/**
 * @Author: Cenobitor
 * @Description: 卖家端
 * @Date: Created in 11:42 PM 2018/4/17
 * @Modified By:
 */
public interface SellerService {
    /**
     * 根据卖家openid查询用户
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);

    /**
     * 保存卖家用户信息
     * @param sellerInfo
     */
    void saveSellerInfo(SellerInfo sellerInfo);
}
