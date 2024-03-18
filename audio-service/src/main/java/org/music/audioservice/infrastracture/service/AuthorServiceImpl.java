package org.music.audioservice.infrastracture.service;

import org.music.audioservice.domain.model.Author;
import org.music.audioservice.domain.repository.AuthorRepository;
import org.music.audioservice.handler.errors.ErrorDescription;
import org.music.audioservice.handler.exceptions.ConflictException;
import org.music.audioservice.handler.exceptions.NotFoundException;
import org.music.audioservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthors() {
        if (authorRepository.count() == 0) {
            throw new NotFoundException(ErrorDescription.emptyAuthorList);
        }
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> getAuthorById(UUID id) {
        if (!authorRepository.existsById(id)) {
            throw new NotFoundException(ErrorDescription.authorNotFoundException);
        }
        return authorRepository.findById(id);
    }

    @Override
    public Author save(Author author) {
        if (authorRepository.existsById(author.getId())) {
            throw new ConflictException(ErrorDescription.authorExistException);
        }
        return authorRepository.save(author);
    }

    @Override
    public void removeById(UUID id) {
        if (!authorRepository.existsById(id)) {
            throw new NotFoundException(ErrorDescription.emptyAuthorList);
        }
        authorRepository.deleteById(id);
    }
}
