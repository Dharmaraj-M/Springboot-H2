package com.springboot.springbooth2;

import com.springboot.springbooth2.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class SpringbootH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootH2Application.class, args);
    }

}
