package com.wanda.swagger.model;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by yanjie on 2016/9/28.
 */
@ApiModel
public class ProductModel {
    @ApiModelProperty(value="产品名称", required = true)
    private String name;

    @ApiModelProperty(value="产品图片地址", required = true)
    private String pic;

    @ApiModelProperty(value="产品价格", required = true)
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
