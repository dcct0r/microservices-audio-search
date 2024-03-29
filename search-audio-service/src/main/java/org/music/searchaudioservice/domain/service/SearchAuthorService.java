package org.music.searchaudioservice.domain.service;


import org.music.audioservice.domain.model.Author;

import java.util.Optional;

public interface SearchAuthorService {
    Author findAuthorByFirstNameAndLastName(String firstname, String lastname);
    Optional<Author> findAuthorsByFirstName(String firstname);
    Optional<Author> findAuthorsByCitizenship(String citizenship);
    Optional<Author> findAuthorsByGenre(String genre);
    Optional<Author> findAuthorsByMale(String male);
}
