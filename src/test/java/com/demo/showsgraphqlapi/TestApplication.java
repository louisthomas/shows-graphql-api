package com.demo.showsgraphqlapi;

import com.demo.showsgraphqlapi.config.ContainerConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(TestApplication.class)
                .initializers(new ContainerConfiguration.Initializer())
                .profiles("local")
                .run(args);
    }
}
