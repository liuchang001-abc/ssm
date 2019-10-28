package com.panku.ssm.service;

import com.panku.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    /**
     * 查询所有的产品
     *
     * @return
     */
    public List<Product> findAll() throws Exception;
}
