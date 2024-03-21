package org.music.searchaudioservice.infrastracture.api.controller;

import org.music.audioservice.domain.model.Author;
import org.music.searchaudioservice.domain.service.SearchAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/search/authors")
public class SearchAuthorController {

    private final SearchAuthorService authorService;

    @Autowired
    public SearchAuthorController(SearchAuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/{firstname}/{lastname}", method = RequestMethod.GET)
    public ResponseEntity<Author> getAuthorByFirstNameAndLastName(@PathVariable String firstname,
                                                                  @PathVariable String lastname) {
        return new ResponseEntity<>(authorService.findAuthorByFirstNameAndLastName(firstname, lastname), HttpStatus.OK);
    }

    @RequestMapping(value = "/{firstname}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Author>> getAuthorByFirstname(@PathVariable String firstname) {
        return new ResponseEntity<>(authorService.findAuthorsByFirstName(firstname), HttpStatus.OK);
    }

    @RequestMapping(value = "/{citizenship}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Author>> getAuthorsByCitizenship(@PathVariable String citizenship) {
        return new ResponseEntity<>(authorService.findAuthorsByCitizenship(citizenship), HttpStatus.OK);
    }

    @RequestMapping(value = "/{genre}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Author>> getAuthorsByGenre(@PathVariable String genre) {
        return new ResponseEntity<>(authorService.findAuthorsByGenre(genre), HttpStatus.OK);
    }

    @RequestMapping(value = "/{male}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Author>> getAuthorsByMale(@PathVariable String male) {
        return new ResponseEntity<>(authorService.findAuthorsByMale(male), HttpStatus.OK);
    }
}
