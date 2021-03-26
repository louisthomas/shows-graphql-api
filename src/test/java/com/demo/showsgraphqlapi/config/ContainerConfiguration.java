package com.demo.showsgraphqlapi.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.lifecycle.Startables;
import org.testcontainers.utility.DockerImageName;

import java.util.Map;
import java.util.stream.Stream;

@Testcontainers

public class ContainerConfiguration {

    public static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext>{

        static MongoDBContainer mongoDB = new MongoDBContainer(DockerImageName.parse("mongo:4.4.4"));

        public static Map<String, String> getProperties(){
            Startables.deepStart(Stream.of(mongoDB)).join();
            return Map.of(
                    "spring.data.mongodb.uri", String.format("mongodb://%s:%s/%s", mongoDB.getContainerIpAddress(), mongoDB.getMappedPort(27017), "show"));
        }

        @Override
        public void initialize(ConfigurableApplicationContext applicationContext) {
            var env = applicationContext.getEnvironment();

            env.getPropertySources().addFirst(new MapPropertySource(
                    "testContainerProperties", (Map) getProperties()
            ));
        }
    }
}
