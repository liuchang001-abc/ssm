package com.panku.ssm.controller;

import com.panku.ssm.domain.Product;
import com.panku.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 这个类是处理product的控制器（ProductController）
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> list = productService.findAll();
        mv.addObject("",list);
        mv.setViewName("");
        return mv;
    }
}
