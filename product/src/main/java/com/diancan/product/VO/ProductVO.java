package com.diancan.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductVO {
    @JsonProperty("name")
    private String catName;
    @JsonProperty("type")
    private Integer catType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
