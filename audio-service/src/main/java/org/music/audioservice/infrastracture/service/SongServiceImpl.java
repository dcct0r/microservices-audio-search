package org.music.audioservice.infrastracture.service;

import org.music.audioservice.domain.model.Song;
import org.music.audioservice.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SongServiceImpl implements SongService {

    @Override
    public List<Song> getAllSongs() {
        return null;
    }

    @Override
    public Song getSongById(UUID id) {
        return null;
    }

    @Override
    public void save(Song song) {

    }

    @Override
    public void removeById(UUID id) {

    }
}
