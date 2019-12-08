package com.example.mall.controller;


import com.alibaba.fastjson.JSONObject;

import com.example.mall.entity.User;
import com.example.mall.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@Controller
public class AuthorizeController {

    @Autowired
    private UserMapper userMapper;
    @ApiOperation("根据用户名获取用户列表~~")
    @ResponseBody
    @PostMapping("/selectUserbyid")
    public String Callback(@RequestParam(name = "id") String id) {
        User user = userMapper.selectByPrimaryKey(Integer.valueOf(id));
        return  new JSONObject().toJSONString(user);
    }
}
