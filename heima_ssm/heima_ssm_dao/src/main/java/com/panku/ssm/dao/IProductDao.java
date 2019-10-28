package com.panku.ssm.dao;

import com.panku.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
public interface IProductDao {

    /**
     * 查询所有的产品
     *
     * @return
     */
    @Select("select * from product")
    public  List<Product> findAll() throws Exception;
}
