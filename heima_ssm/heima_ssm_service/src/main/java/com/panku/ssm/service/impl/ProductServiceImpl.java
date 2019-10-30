package com.panku.ssm.service.impl;

import com.panku.ssm.dao.IProductDao;
import com.panku.ssm.domain.Product;
import com.panku.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//加入事务
@Transactional
public class ProductServiceImpl implements IProductService {

    //业务层关联持久层
    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
