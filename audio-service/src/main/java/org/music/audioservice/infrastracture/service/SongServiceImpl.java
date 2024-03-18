package org.music.audioservice.infrastracture.service;

import org.music.audioservice.domain.model.Song;
import org.music.audioservice.domain.repository.SongRepository;
import org.music.audioservice.handler.errors.ErrorDescription;
import org.music.audioservice.handler.exceptions.ConflictException;
import org.music.audioservice.handler.exceptions.NotFoundException;
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
        if (songRepository.count() == 0) {
            throw new NotFoundException(ErrorDescription.emptySongList);
        }
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> getSongById(UUID id) {
        if (!songRepository.existsById(id)) {
            throw new NotFoundException(ErrorDescription.songNotFoundException);
        }
        return songRepository.findById(id);
    }

    @Override
    public Song save(Song song) {
        if (songRepository.existsById(song.getId())) {
            throw new ConflictException(ErrorDescription.songExistException);
        }
        songRepository.save(song);
        return song;
    }

    @Override
    public Song edit(UUID id, String description) {
        return songRepository.findById(id).map(s -> {
                    s.setDescription(description);
                    return songRepository.save(s);
                }).orElseThrow(() -> new NotFoundException(ErrorDescription.songNotFoundException));
    }

    @Override
    public void removeById(UUID id) {
        if (!songRepository.existsById(id)) {
            throw new NotFoundException(ErrorDescription.emptySongList);
        }
        songRepository.deleteById(id);
    }
}
