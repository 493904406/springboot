package com.app.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author gejiangbo
 * @Description
 * @date:2019/8/5
 * @mail jiangbo.ge@kuwo.cn
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login/login";
    }
    @PostMapping("/doLogin")
    public String doLogin(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(username, password));
            System.out.println("登录成功!");
            return "login/index";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("登录失败!");
            return "login/unauthorizedurl";
        }
    }
}
