package com.wanda.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yanjie on 2016/9/26.
 */
@ApiModel
public class UamGroup {
    @ApiModelProperty(value="群组Id", required = true)
    private String groupId;

    @ApiModelProperty(value="群组名称", required = true)
    private String name;

    @ApiModelProperty(value = "群组的头像", required = false)
    private String icon;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
