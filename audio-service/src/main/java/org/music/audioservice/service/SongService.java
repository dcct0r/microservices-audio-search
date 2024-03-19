package org.music.audioservice.service;

import org.music.audioservice.domain.model.Song;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SongService {
    List<Song> getAllSongs();
    Optional<Song> getSongById(UUID id);
    Song save(Song song);
    Song edit(UUID id, String description);
    void removeById(UUID id);
    void songSubscription(UUID id);
}
