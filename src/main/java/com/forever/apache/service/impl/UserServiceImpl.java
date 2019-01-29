package com.forever.apache.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.forever.apache.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author liuhq
 * @date 2019/1/29
 */
@Service(
    version = "${demo.service.version}",
    application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}",
    registry = "${dubbo.registry.id}"
)
@Component
public class UserServiceImpl implements UserService {

  @Override
  public String sayHi(String name) {
    return name + ":hello dubbo";
  }
}
