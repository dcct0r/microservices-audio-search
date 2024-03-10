package org.music.audioservice.infrastracture.service;

import org.music.audioservice.domain.model.Song;
import org.music.audioservice.domain.repository.SongRepository;
import org.music.audioservice.handler.errors.TextMessages;
import org.music.audioservice.handler.exceptions.SongNotFoundException;
import org.music.audioservice.handler.exceptions.SongExistException;
import org.music.audioservice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;

    @Autowired
    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> getAllSongs() {
        if(songRepository.count() == 0) {
            throw new SongNotFoundException(TextMessages.emptySongList);
        }
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> getSongById(UUID id) {
        if(!songRepository.existsById(id)) {
            throw new SongNotFoundException(TextMessages.songDoesntExistException);
        }
        return songRepository.findById(id);
    }

    @Override
    public Song save(Song song) {
        if(songRepository.existsById(song.getId())) {
            throw new SongExistException(TextMessages.songExistException);
        }
        songRepository.save(song);
        return song;
    }

    @Override
    public void removeById(UUID id) {
        if(!songRepository.existsById(id)) {
            throw new SongNotFoundException(TextMessages.songDoesntExistException);
        } else {
            songRepository.deleteById(id);
        }
    }
}
