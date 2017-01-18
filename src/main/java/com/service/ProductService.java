package com.service;

import com.dao.ProductDao;
import com.entity.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/11/29.
 */
@Transactional
public class ProductService {

    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void save(Product product){
        productDao.save(product);
        System.out.println("service执行了...");
    }
}
