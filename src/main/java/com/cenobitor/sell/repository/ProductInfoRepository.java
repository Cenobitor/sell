package com.cenobitor.sell.repository;

import com.cenobitor.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:32 PM 2018/4/12
 * @Modified By:
 */
public interface ProductInfoRepository  extends JpaRepository<ProductInfo,String>{

    @Query
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
