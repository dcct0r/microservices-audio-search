package org.music.searchlyricsservice.infrastracture.db.repository;

import org.music.searchlyricsservice.domain.model.Author;
import org.music.searchlyricsservice.domain.model.Song;
import org.music.searchlyricsservice.domain.repository.SearchRepo;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SearchRepoImpl implements SearchRepo {
    @Override
    public Optional<Song> findSongByName() {
        return Optional.empty();
    }

    @Override
    public Optional<Song> findSongByGenre() {
        return Optional.empty();
    }

    @Override
    public Optional<Author> finaAuthorByName() {
        return Optional.empty();
    }

    @Override
    public Optional<Author> finaAuthorByGenre() {
        return Optional.empty();
    }
}
