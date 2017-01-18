package com.dao;

import com.entity.Product;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by admin on 2016/11/29.
 */
public class ProductDao extends HibernateDaoSupport{

    public void save(Product product){
        this.getHibernateTemplate().save(product);
        System.out.println("Dao层执行了...");
    }
}
