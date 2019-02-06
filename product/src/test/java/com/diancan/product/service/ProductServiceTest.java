package com.diancan.product.service;

import com.diancan.product.dataobject.ProductInfo;
import com.diancan.product.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private ProductService repository;
    @Test
    public void findAll() {
        List<ProductInfo> list =  repository.findAll();
        Assert.assertTrue(list.size()==2);


    }
}