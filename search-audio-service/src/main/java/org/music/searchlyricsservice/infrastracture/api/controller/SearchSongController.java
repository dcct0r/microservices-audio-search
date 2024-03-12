package org.music.searchlyricsservice.infrastracture.api.controller;

import org.music.searchlyricsservice.domain.model.Song;
import org.music.searchlyricsservice.service.SearchSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/search/songs")
public class SearchSongController {

    private final SearchSongService songService;

    @Autowired
    public SearchSongController(SearchSongService songService) {
        this.songService = songService;
    }

    @GetMapping("/")
    public ResponseEntity<Song> getSongByAuthorAndTitle(@RequestBody String author, @RequestBody String title) {
        return new ResponseEntity<>(songService.findSongByAuthorAndTitle(author, title), HttpStatus.OK);
    }

    @GetMapping("/title")
    public ResponseEntity<Optional<Song>> getSongsByTitle(@RequestBody String title) {
        return new ResponseEntity<>(songService.findSongsByTitle(title), HttpStatus.OK);
    }
}
