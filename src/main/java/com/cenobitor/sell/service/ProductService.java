package com.cenobitor.sell.service;

import com.cenobitor.sell.dataobject.ProductCategory;
import com.cenobitor.sell.dataobject.ProductInfo;
import com.cenobitor.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:08 PM 2018/4/11
 * @Modified By:
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
