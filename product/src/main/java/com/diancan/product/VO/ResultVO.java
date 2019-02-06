package com.diancan.product.VO;

import lombok.Data;
/*
http request 返回的最外层对象
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private T data;
    private String msg;
}
