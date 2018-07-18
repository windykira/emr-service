package com.haoze.controller.demo;

import com.alibaba.fastjson.JSONObject;
import com.haoze.config.MD5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 2018/7/18.
 */
@Controller
public class LoginController {


    @PostMapping("/login")
    @ResponseBody
    String userLogin(String username, String password) {

        JSONObject jsonObject = new JSONObject();
        password = MD5Util.encrypt(username, password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            jsonObject.put("token", subject.getSession().getId());
            jsonObject.put("msg", "登录成功");
            //CurrentUser.setCurrentUserDepartment(departmentId);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return jsonObject.toJSONString();
    }

    @RequestMapping(value = "/unauth")
    @ResponseBody
    public Map<String, Object> unauth() {
        Map<String, Object> map = new HashMap();
        map.put("code", "1000000");
        map.put("msg", "未登录");
        return map;
    }
}
