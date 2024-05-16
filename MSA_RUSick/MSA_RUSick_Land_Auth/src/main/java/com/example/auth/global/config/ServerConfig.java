package com.example.auth.global.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ServerConfig {
    @Value("${token.secret}")
    private String secret;
    @Value("${token.expiration}")
    private Long expiration;

}
