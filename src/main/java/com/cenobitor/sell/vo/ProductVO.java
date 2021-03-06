package com.cenobitor.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品包含类目
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 11:32 PM 2018/4/13
 * @Modified By:
 */
@Data
public class ProductVO implements Serializable{

    private static final long serialVersionUID = 4077713044617867556L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
