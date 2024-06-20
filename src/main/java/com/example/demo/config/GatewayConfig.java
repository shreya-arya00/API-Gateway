package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("my-service", r -> r.path("/api/my-service/**")
                        .uri("http://localhost:8081"))
                .route("another-service", r -> r.path("/api/another-service/**")
                        .uri("http://localhost:8082"))
                .build();
    }
}
