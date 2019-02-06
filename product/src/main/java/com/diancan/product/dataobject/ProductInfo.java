package com.diancan.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private Integer productStock;
    private BigDecimal productPrice;
    private Integer productStatus;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
