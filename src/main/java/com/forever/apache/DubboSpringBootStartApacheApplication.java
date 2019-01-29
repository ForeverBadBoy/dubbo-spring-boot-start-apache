package com.forever.apache;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author liuhq
 */
@EnableDubbo
@SpringBootApplication
public class DubboSpringBootStartApacheApplication {

  public static void main(String[] args) {
    //SpringApplication.run(DubboSpringBootStartApacheApplication.class, args);
    new SpringApplicationBuilder(DubboSpringBootStartApacheApplication.class)
        .web(WebApplicationType.NONE)
        .run(args);
  }

}

