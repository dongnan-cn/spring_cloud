package com.diancan.product.service;

import com.diancan.product.dataobject.ProductCategory;
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
public class CategoryServiceTest {
    @Autowired
    private CategoryService service;
    @Test
    public void findCategoryIn() {
        List<ProductCategory> result = service.findCategoryIn(Arrays.asList(1,2));
        Assert.assertTrue(result.size()==2);
    }
}