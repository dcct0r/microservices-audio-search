package org.music.searchaudioservice.service;

import org.music.searchaudioservice.domain.model.Author;

import java.util.Optional;

public interface SearchAuthorService {
    Author findAuthorByFirstNameAndLastName(String firstname, String lastname);
    Optional<Author> findAuthorsByFirstName(String firstname);
    Optional<Author> findAuthorsByCitizenship(String citizenship);
    Optional<Author> findAuthorsByGenre(String genre);
    Optional<Author> findAuthorsByMale(String male);
}
