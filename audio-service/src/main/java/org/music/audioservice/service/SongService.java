package org.music.audioservice.service;

import org.music.audioservice.domain.model.Song;

import java.util.List;
import java.util.UUID;

public interface SongService {
    List<Song> getAllSongs();
    Song getSongById(UUID id);
    void save(Song song);
    void removeById(UUID id);
}
