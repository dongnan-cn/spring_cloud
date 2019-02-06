package com.diancan.product.service;

import com.diancan.product.dataobject.ProductCategory;
import com.diancan.product.dataobject.ProductInfo;

import java.util.List;

public interface CategoryService {
    List<ProductCategory> findCategoryIn(List<Integer> categoryList);
}
