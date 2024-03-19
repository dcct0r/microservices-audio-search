package org.music.audioservice.infrastracture.api.controller;

import org.music.audioservice.domain.dto.SongDto;
import org.music.audioservice.domain.model.Song;
import org.music.audioservice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("catalog/songs")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Song>> getAllSongs() {
        return new ResponseEntity<>(songService.getAllSongs(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Song>> getSongById(@PathVariable UUID id) {
        return new ResponseEntity<>(songService.getSongById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/", consumes = "application/json", method = RequestMethod.POST)
    public ResponseEntity<Song> addSong(@RequestBody SongDto songDto) {
        Song song = songService.save(Song.builder()
                .title(songDto.getTitle())
                .author(songDto.getAuthor())
                .description(songDto.getDescription())
                .build());
        return new ResponseEntity<>(song, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> editSong(@PathVariable UUID id,
                                         @RequestBody String description) {
        songService.edit(id, description);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/subscription/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> subscribe(@PathVariable UUID id) {
        songService.songSubscription(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeSongById(@PathVariable UUID id) {
        songService.removeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
