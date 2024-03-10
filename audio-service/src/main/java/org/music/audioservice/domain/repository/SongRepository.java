package org.music.audioservice.domain.repository;

import org.music.audioservice.domain.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SongRepository {
    List<Song> getAllSongs();
    Song getSongById(UUID id);
    void save(Song song);
    void removeById(UUID id);
}
