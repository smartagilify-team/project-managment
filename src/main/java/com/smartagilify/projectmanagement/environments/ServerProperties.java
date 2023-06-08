package com.smartagilify.projectmanagement.environments;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "application.yml")
@Getter
@Setter
public class ServerProperties {
    @Value("${spring.profiles.active}")
    private String environment;
}
