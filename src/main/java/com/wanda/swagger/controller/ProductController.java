package com.wanda.swagger.controller;

import com.wanda.swagger.model.ProductModel;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by yanjie on 2016/9/28.
 */
@RestController
@RequestMapping(value = "/product", produces = {"application/json;charset=utf-8"})
@Api(value = "/product", description = "产品管理")
public class ProductController {
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ApiOperation(notes = "list", httpMethod = "GET", value = "获取产品列表")
    @ResponseBody
    public List<ProductModel> getProducts(){
        List<ProductModel> productModelList = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            ProductModel productModel = new ProductModel();
            productModel.setName("test" + i);
            productModel.setPic("http://www.baidu.com");
            Random ra = new Random();
            productModel.setPrice(ra.nextDouble() * 100 + 1);
            productModelList.add(productModel);
        }
        return productModelList;
    }
}
