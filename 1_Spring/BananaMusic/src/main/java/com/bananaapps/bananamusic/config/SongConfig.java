package com.bananaapps.bananamusic.config;

import com.bananaapps.bananamusic.persistence.music.SongRepository;
import com.bananaapps.bananamusic.persistence.music.SongRepositoryImpl;
import com.bananaapps.bananamusic.service.music.Catalog;
import com.bananaapps.bananamusic.service.music.CatalogImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SongConfig {

    @Bean
    public SongRepository songRepository() {
        return new SongRepositoryImpl();
    }

    @Bean
    public Catalog catalog( SongRepository songRepository) {

        Catalog catalog =  new CatalogImpl();
        catalog.setSongRepository(songRepository);

        return catalog;
    }
}
