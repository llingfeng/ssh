package com.action;

import com.entity.Product;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.ProductService;

/**
 * Created by admin on 2016/11/29.
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{

    //模型驱动要使用的类
    private Product product = new Product();
    @Override
    public Product getModel() {
        return product;
    }

    //struts和spring整合过程中按名称自动注入
    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public String save(){
        productService.save(product);
        return NONE;
    }
}
