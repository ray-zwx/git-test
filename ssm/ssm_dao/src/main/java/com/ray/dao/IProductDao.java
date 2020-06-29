package com.ray.dao;

import com.ray.ssm.domain.Product;

import java.util.List;

public interface IProductDao {
    //查询所有的产品信息
    public List<Product> findAll() throws Exception;
}
