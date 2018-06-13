package com.cenobitor.sell.dataobject.mapper;

import com.cenobitor.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Date: Created in 1:53 PM 2018/4/18
 * @Author: Cenobitor
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryMapperTest {


    @Autowired
    private ProductCategoryMapper mapper;

    //category_name,jdbcType=VARCHAR},#{category_type,jdbcType=INTEGER

    @Test
    public void insertByMap() {
        Map<String,Object> map = new HashMap<>();
        map.put("category_name","女士专区");
        map.put("category_type",101);
        int i = mapper.insertByMap(map);
        Assert.assertEquals(1,i);
    }

    @Test
    public void insertByObject() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(102);

        int i = mapper.insertByObject(productCategory);
        Assert.assertEquals(1,i);
    }

    @Test
    public void findByCategoryType(){
        ProductCategory productCategory = mapper.findByCategoryType(101);
        Assert.assertNotNull(productCategory);
    }


    @Test
    public void findByCategoryName(){
        List<ProductCategory> categories = mapper.findByCategoryName("女生最爱");
        Assert.assertNotNull(categories);
    }


    @Test
    public void updateByCategoryType(){
        int i = mapper.updateByCategoryType("女生专属", 101);
        Assert.assertNotNull("1",1);
    }

    @Test
    public void updateByObject(){

        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最不爱");
        productCategory.setCategoryType(102);

        int i = mapper.updateByObject(productCategory);
        Assert.assertEquals(1,i);
    }

    @Test
    public void delete(){

        int i = mapper.delete(102);
        Assert.assertEquals(1,i);
    }

    @Test
    public void selectByCategoryType(){
        ProductCategory productCategory = mapper.selectByCategoryType(101);
        Assert.assertNotNull(productCategory);
    }


}