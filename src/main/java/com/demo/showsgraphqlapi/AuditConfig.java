package com.demo.showsgraphqlapi;

import org.springframework.boot.actuate.audit.InMemoryAuditEventRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditConfig {

    @Bean
    public InMemoryAuditEventRepository repository(){
        return new InMemoryAuditEventRepository();
    }
}
