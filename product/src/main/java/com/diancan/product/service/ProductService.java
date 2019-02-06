package com.diancan.product.service;

import com.diancan.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {
    List<ProductInfo> findAll();
}
