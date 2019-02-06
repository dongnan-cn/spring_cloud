package com.diancan.product.repository;

import com.diancan.product.dataobject.ProductCategory;
import com.diancan.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
