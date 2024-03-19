package org.music.audioservice.infrastracture.service;

import org.music.audioservice.domain.model.Song;
import org.music.audioservice.domain.repository.SongRepository;
import org.music.audioservice.event.SongSubscriptionEvent;
import org.music.audioservice.handler.errors.ErrorDescription;
import org.music.audioservice.handler.exceptions.ConflictException;
import org.music.audioservice.handler.exceptions.NotFoundException;
import org.music.audioservice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;
    private final KafkaTemplate<String, SongSubscriptionEvent> kafkaTemplate;

    @Autowired
    public SongServiceImpl(SongRepository songRepository, KafkaTemplate<String, SongSubscriptionEvent> kafkaTemplate) {
        this.songRepository = songRepository;
        this.kafkaTemplate = kafkaTemplate;
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

    @Override
    public void songSubscription(UUID id) {
        if(songRepository.existsById(id)) {
           throw new ConflictException(ErrorDescription.songExistException);
        }
        kafkaTemplate.send("songSubscription", new SongSubscriptionEvent(
                "You have subscribed to the track, when it is added we will definitely notify you",
                "Success"));
    }
}
