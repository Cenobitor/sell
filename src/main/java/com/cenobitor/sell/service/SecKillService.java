package com.cenobitor.sell.service;

/**
 * @Description:
 * @Date: Created in 4:44 PM 2018/4/18
 * @Author: Cenobitor
 * @Modified By:
 */
public interface SecKillService {
    String querySecKillProductInfo(String productId);

    void orderProductMockDiffUser(String productId);
}
