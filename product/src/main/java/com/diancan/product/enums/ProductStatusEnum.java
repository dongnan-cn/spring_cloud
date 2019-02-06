package com.diancan.product.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),

    DOWN(1,"下架");

    private Integer code;
    private String desc;

    ProductStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
