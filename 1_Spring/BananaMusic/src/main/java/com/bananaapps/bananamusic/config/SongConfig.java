package com.bananaapps.bananamusic.config;

import com.bananaapps.bananamusic.persistence.music.SongRepository;
import com.bananaapps.bananamusic.persistence.music.SongRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SongConfig {

    @Bean
    public SongRepository songRepository() {
        return new SongRepositoryImpl();
    }
}
