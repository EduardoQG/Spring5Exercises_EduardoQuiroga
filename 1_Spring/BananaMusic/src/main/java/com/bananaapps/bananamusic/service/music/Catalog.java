package com.bananaapps.bananamusic.service.music;

import java.util.Collection;

import com.bananaapps.bananamusic.domain.music.Song;
import com.bananaapps.bananamusic.persistence.music.SongRepository;

public interface Catalog {

	   public Song findById(Long id);
	   public Collection<Song> findByKeyword(String keyword);
	   public long size();
	   public void save(Song song);
	   public void saveCollection(Collection<Song> songs);

    void setSongRepository(SongRepository songRepository);
}