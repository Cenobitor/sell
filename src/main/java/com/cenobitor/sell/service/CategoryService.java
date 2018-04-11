package com.cenobitor.sell.service;

import com.cenobitor.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:08 PM 2018/4/11
 * @Modified By:
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
