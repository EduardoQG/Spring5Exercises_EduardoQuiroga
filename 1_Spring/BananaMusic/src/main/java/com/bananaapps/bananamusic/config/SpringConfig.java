package com.bananaapps.bananamusic.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
// @ComponentScan(basePackages = {"com.bananaapps.bananamusic.persistence", "com.bananaapps.bananamusic.service.music"})
@EntityScan("com.bananaapps.bananamusic.domain")
public class SpringConfig {

}
