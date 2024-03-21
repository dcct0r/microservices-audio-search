package org.music.audioservice.domain.service;

import org.music.audioservice.domain.model.Author;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AuthorService {
    List<Author> getAllAuthors();
    Optional<Author> getAuthorById(UUID id);
    Author save(Author author);
    void removeById(UUID id);
}
