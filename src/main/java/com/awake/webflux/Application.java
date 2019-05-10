package com.awake.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 *
 * @author hui.zhou 2019/5/10
 */
@SpringBootApplication
@Configuration
@EnableWebFlux
@ComponentScan(value = {"com.awake.webflux.web"})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
