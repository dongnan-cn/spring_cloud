package com.diancan.product.repository;

import com.diancan.product.dataobject.ProductCategory;
import com.diancan.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findByCategoryTypeIn() {

        List<ProductCategory> list = repository.findByCategoryTypeIn(Arrays.asList(1,2));
        Assert.assertTrue(list.size() > 0);
    }
}