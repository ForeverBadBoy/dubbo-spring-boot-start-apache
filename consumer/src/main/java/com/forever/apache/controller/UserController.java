package com.forever.apache.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.forever.apache.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhq
 * @date 2019/1/29
 */
@RestController
public class UserController {

  @Reference(version = "${demo.service.version}")
  private UserService userService;

  @GetMapping("/hello")
  public String hello() {
    String result = userService.sayHi("forever");
    return result;
  }
}
