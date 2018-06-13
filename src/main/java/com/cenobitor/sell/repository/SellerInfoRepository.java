package com.cenobitor.sell.repository;

import com.cenobitor.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 10:40 PM 2018/4/17
 * @Modified By:
 */
@Repository
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String>{

    @Query
    SellerInfo findByOpenid(String openid);
}
