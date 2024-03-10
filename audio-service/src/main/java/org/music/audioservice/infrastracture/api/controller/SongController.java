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

    @GetMapping("/all")
    public ResponseEntity<List<Song>> getAllSongs() {
        return new ResponseEntity<>(songService.getAllSongs(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Song>> getSongById(@PathVariable UUID id) {
        return new ResponseEntity<>(songService.getSongById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/", consumes = "application/json")
    public ResponseEntity<Song> addSong(@RequestBody SongDto songDto) {
        Song song = songService.save(Song.builder()
                .songName(songDto.getSongName())
                .authorName(songDto.getAuthorName())
                .description(songDto.getDescription())
                .build());
        return new ResponseEntity<>(song, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeSongById(@PathVariable UUID id) {
        songService.removeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
