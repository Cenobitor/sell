package com.cenobitor.sell.repository;

import com.cenobitor.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 9:42 PM 2018/4/11
 * @Modified By:
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
