package io.github.wzp.dubboconsumer.controller;

import io.github.wzp.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("hello")
    public String user(){

        return userService.Hello();
    }
}
