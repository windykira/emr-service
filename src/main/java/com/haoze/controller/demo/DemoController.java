package com.haoze.controller.demo;

import com.alibaba.fastjson.JSONObject;
import com.haoze.config.MD5Util;
import com.haoze.model.demo.DemoEntity;
import com.haoze.service.DemoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hp on 2018/7/18.
 */
@Controller
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/list")
    @ResponseBody
    List<DemoEntity> list(){
        return demoService.list();
    }

}
