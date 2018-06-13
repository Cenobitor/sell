package com.cenobitor.sell.dataobject.mapper;

import com.cenobitor.sell.dataobject.ProductCategory;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Date: Created in 1:49 PM 2018/4/18
 * @Author: Cenobitor
 * @Modified By:
 */
@Repository
public interface ProductCategoryMapper {
    /**
     * 插入
     * @param map
     * @return
     */
    @Insert("insert into product_category(category_name,category_type) values(#{category_name,jdbcType=VARCHAR},#{category_type,jdbcType=INTEGER})")
    int insertByMap(Map<String,Object> map);

    @Insert("insert into product_category(category_name,category_type) values(#{categoryName,jdbcType=VARCHAR},#{categoryType,jdbcType=INTEGER})")
    int insertByObject(ProductCategory productCategory);

    /**
     * 查询
     * @param categoryType
     * @return
     */
    @Select("select * from product_category where category_type = #{categoryType}")
    @Results({
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "category_name",property = "categoryName"),
            @Result(column = "category_type",property = "categoryType")
    })
    ProductCategory findByCategoryType(Integer categoryType);

    @Select("select * from product_category where category_name = #{categoryName}")
    @Results({
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "category_name",property = "categoryName"),
            @Result(column = "category_type",property = "categoryType")
    })
    List<ProductCategory> findByCategoryName(String categoryName);

    /**
     * 更新
     * @param categoryName
     * @param categoryType
     * @return
     */
    @Update("update product_category set category_name = #{categoryName}  where category_type = #{categoryType}")
    int updateByCategoryType(@Param("categoryName") String categoryName,
                             @Param("categoryType") Integer categoryType);

    @Update("update product_category set category_name = #{categoryName}  where category_type = #{categoryType}")
    int updateByObject(ProductCategory productCategory);

    /**
     * 删除
     * @param categoryType
     * @return
     */
    @Delete("delete from product_category where category_type = #{categoryType} ")
    int delete(Integer categoryType);


    /**
     * 使用xml,于resources/mapper文件夹下建ProductCategoryMapper.xml
     * @param categoryType
     * @return
     */
    ProductCategory selectByCategoryType(Integer categoryType);

}
