package com.wanda.swagger.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import com.wanda.swagger.model.UamGroup;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(value = "/group", produces = {"application/json;charset=utf-8"})
@Api(value = "/group", description="add a new group")
public class GroupController {
    @RequestMapping(value = "addGroup", method = RequestMethod.PUT)
    @ApiOperation(notes = "addGroup", httpMethod = "POST", value = "添加一个新的群组")
    @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
    @ResponseBody
    public UamGroup addGroup(@ApiParam(required = true, value = "group data") @RequestBody UamGroup group) {
        return group;
    }

    @RequestMapping(value = "getAccessibleGroups", method = RequestMethod.GET)
    @ApiOperation(notes = "getAccessibleGroups", httpMethod = "GET", value = "获取我可访问的群组列表 ")
    @ResponseBody
    public List<UamGroup> getAccessibleGroups() {
        UamGroup group1 = new UamGroup();
        group1.setGroupId("1");
        group1.setName("testGroup1");

        UamGroup group2 = new UamGroup();
        group2.setGroupId("2");
        group2.setName("testGroup2");

        List<UamGroup> groupList = new LinkedList<UamGroup>();
        groupList.add(group1);
        groupList.add(group2);

        return groupList;
    }
}
