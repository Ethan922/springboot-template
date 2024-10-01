package com.ethan.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "jwt")
public class jwtProperties {
    private String secretKey;

    private int ttl;

    private String tokenName;

}
