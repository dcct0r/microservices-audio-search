package org.music.searchaudioservice.domain.repository;

import org.music.audioservice.domain.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SearchAuthorRepository extends JpaRepository<Author, UUID> {
    Author findAuthorByFirstNameAndLastName(String firstname, String lastname);
    Optional<Author> findAuthorsByFirstName(String firstname);
    Optional<Author> findAuthorsByCitizenship(String citizenship);
    Optional<Author> findAuthorsByGenre(String genre);
    Optional<Author> findAuthorsByMale(String male);
}
