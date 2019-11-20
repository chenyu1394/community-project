package com.chenyu.community.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TbUserController {
    //获取用户信息名
    @RequestMapping("/user")
    public Object currentUserName(Principal principal) {
        return principal.getName();
    }
}
