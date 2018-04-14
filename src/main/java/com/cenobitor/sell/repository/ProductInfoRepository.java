package com.cenobitor.sell.repository;

import com.cenobitor.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:32 PM 2018/4/12
 * @Modified By:
 */
public interface ProductInfoRepository  extends JpaRepository<ProductInfo,String>{

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
