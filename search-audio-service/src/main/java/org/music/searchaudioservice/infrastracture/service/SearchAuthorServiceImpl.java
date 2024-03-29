package org.music.searchaudioservice.infrastracture.service;

import org.music.audioservice.domain.model.Author;
import org.music.searchaudioservice.domain.repository.SearchAuthorRepository;
import org.music.searchaudioservice.handler.errors.ErrorDescription;
import org.music.searchaudioservice.handler.exceptions.NotFoundException;
import org.music.searchaudioservice.domain.service.SearchAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SearchAuthorServiceImpl implements SearchAuthorService {

    private final SearchAuthorRepository authorRepository;

    @Autowired
    public SearchAuthorServiceImpl(SearchAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author findAuthorByFirstNameAndLastName(String firstname, String lastname) {
        Author author = authorRepository.findAuthorByFirstNameAndLastName(firstname, lastname);
        if (author == null) throw new NotFoundException(ErrorDescription.NAME_OR_TITLE_NOT_FOUND_EXCEPTION);
        return authorRepository.findAuthorByFirstNameAndLastName(firstname, lastname);
    }

    @Override
    public Optional<Author> findAuthorsByFirstName(String firstname) {
        Optional<Author> author = authorRepository.findAuthorsByFirstName(firstname);
        return Optional.ofNullable(author.stream()
                .findAny()
                .orElseThrow(() -> new NotFoundException(ErrorDescription.NAME_NOT_FOUND_EXCEPTION)));
    }

    @Override
    public Optional<Author> findAuthorsByCitizenship(String citizenship) {
        Optional<Author> author = authorRepository.findAuthorsByCitizenship(citizenship);
        return Optional.ofNullable(author.stream()
                .findAny()
                .orElseThrow(() -> new NotFoundException(ErrorDescription.CITIZENSHIP_NOT_FOUND_EXCEPTION)));
    }

    @Override
    public Optional<Author> findAuthorsByGenre(String genre) {
        Optional<Author> author = authorRepository.findAuthorsByGenre(genre);
        return Optional.ofNullable(author.stream()
                .findAny()
                .orElseThrow(() -> new NotFoundException(ErrorDescription.GENRE_NOT_FOUND_EXCEPTION)));
    }

    @Override
    public Optional<Author> findAuthorsByMale(String male) {
        Optional<Author> author = authorRepository.findAuthorsByMale(male);
        return Optional.ofNullable(author.stream()
                .findAny()
                .orElseThrow(() -> new NotFoundException(ErrorDescription.MALE_NOT_FOUND_EXCEPTION)));
    }
}
