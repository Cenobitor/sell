package com.cenobitor.sell.form;

import lombok.Data;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 9:51 PM 2018/4/14
 * @Modified By:
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
