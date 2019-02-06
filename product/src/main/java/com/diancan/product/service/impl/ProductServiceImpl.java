package com.diancan.product.service.impl;

import com.diancan.product.dataobject.ProductInfo;
import com.diancan.product.repository.ProductInfoRepository;
import com.diancan.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductInfoRepository repository;

    @Override
    public List<ProductInfo> findAll() {
        return repository.findByProductStatus(0);
    }
}
