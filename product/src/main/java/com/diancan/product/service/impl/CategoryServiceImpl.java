package com.diancan.product.service.impl;

import com.diancan.product.dataobject.ProductCategory;
import com.diancan.product.repository.ProductCategoryRepository;
import com.diancan.product.repository.ProductInfoRepository;
import com.diancan.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    ProductCategoryRepository repository;
    @Override
    public List<ProductCategory> findCategoryIn(List<Integer> categoryList) {
        return repository.findByCategoryTypeIn(categoryList);
    }
}
