package org.music.audioservice.infrastracture.api.controller;

import org.music.audioservice.domain.dto.AuthorDto;
import org.music.audioservice.domain.model.Author;
import org.music.audioservice.domain.model.Author;
import org.music.audioservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/catalog/authors")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Author>> getAllAuthors() {
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Author>> getAuthorById(@PathVariable UUID id) {
        return new ResponseEntity<>(authorService.getAuthorById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/", consumes = "application/json")
    public ResponseEntity<Author> addAuthor(@RequestBody AuthorDto authorDto) {
        Author author = authorService.save(Author.builder()
                .firstName(authorDto.getFirstname())
                .lastName(authorDto.getLastname())
                .citizenship(authorDto.getCitizenship())
                .careerStart(authorDto.getCareerStart())
                .birthday(authorDto.getBirthday())
                .male(authorDto.getMale())
                .genre(authorDto.getGenre())
                .build());
        return new ResponseEntity<>(author, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeAuthorById(@PathVariable UUID id) {
        authorService.removeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
