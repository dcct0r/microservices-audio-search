package org.music.searchaudioservice.infrastracture.api.controller;

import org.music.searchaudioservice.domain.model.Author;
import org.music.searchaudioservice.service.SearchAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/search/authors")
public class SearchAuthorController {

    private final SearchAuthorService authorService;

    @Autowired
    public SearchAuthorController(SearchAuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/{firstname}/{lastname}")
    public ResponseEntity<Author> getAuthorByFirstNameAndLastName(@PathVariable String firstname,
                                                                  @PathVariable String lastname) {
        return new ResponseEntity<>(authorService.findAuthorByFirstNameAndLastName(firstname, lastname), HttpStatus.OK);
    }

    @GetMapping("/{firstname}")
    public ResponseEntity<Optional<Author>> getAuthorByFirstname(@PathVariable String firstname) {
        return new ResponseEntity<>(authorService.findAuthorsByFirstName(firstname), HttpStatus.OK);
    }

    @GetMapping("/{citizenship}")
    public ResponseEntity<Optional<Author>> getAuthorsByCitizenship(@PathVariable String citizenship) {
        return new ResponseEntity<>(authorService.findAuthorsByCitizenship(citizenship), HttpStatus.OK);
    }

    @GetMapping("/{genre}")
    public ResponseEntity<Optional<Author>> getAuthorsByGenre(@PathVariable String genre) {
        return new ResponseEntity<>(authorService.findAuthorsByGenre(genre), HttpStatus.OK);
    }

    @GetMapping("/{male}")
    public ResponseEntity<Optional<Author>> getAuthorsByMale(@PathVariable String male) {
        return new ResponseEntity<>(authorService.findAuthorsByMale(male), HttpStatus.OK);
    }
}
