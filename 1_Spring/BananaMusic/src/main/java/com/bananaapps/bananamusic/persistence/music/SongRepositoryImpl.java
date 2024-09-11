package com.bananaapps.bananamusic.persistence.music;


import com.bananaapps.bananamusic.domain.music.Song;
import com.bananaapps.bananamusic.domain.music.SongCategory;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

public class SongRepositoryImpl implements SongRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public Song findOne(Long id) {
        return em.find(Song.class, id);
    }

    @Override
    public Collection<Song> findAll() {

        return em.createQuery("SELECT s FROM Song s", Song.class).getResultList();
    }

    @Override
    public Collection<Song> findByArtistContainingOrTitleContainingAllIgnoreCase(String artist, String title) {

        String keywordFormat = "%" + artist + "%";

        Query query = em.createQuery("SELECT s FROM Song s WHERE LOWER(s.artist) LIKE LOWER(:keyword) OR LOWER(s.title) LIKE LOWER(:keyword)");
        query.setParameter("keyword", keywordFormat);

        return query.getResultList();
    }

    @Override
    public Collection<Song> findBySongCategory(SongCategory category) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    @Transactional
    public Song save(Song song) {
        em.persist(song);
        return song;
    }

    @Override
    public void delete(Song song) {

    }
}
