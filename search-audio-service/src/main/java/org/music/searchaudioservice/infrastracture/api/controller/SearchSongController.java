package org.music.searchaudioservice.infrastracture.api.controller;

import org.music.audioservice.domain.model.Song;
import org.music.searchaudioservice.service.SearchSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/search/songs")
public class SearchSongController {

    private final SearchSongService songService;

    @Autowired
    public SearchSongController(SearchSongService songService) {
        this.songService = songService;
    }

    @RequestMapping(value = "/{author}/{title}", method = RequestMethod.GET)
    public ResponseEntity<Song> getSongByAuthorAndTitle(@PathVariable String author,
                                                        @PathVariable String title) {
        return new ResponseEntity<>(songService.findSongByAuthorAndTitle(author, title), HttpStatus.OK);
    }

    @RequestMapping(value = "/{title}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Song>> getSongsByTitle(@PathVariable String title) {
        return new ResponseEntity<>(songService.findSongsByTitle(title), HttpStatus.OK);
    }
}
