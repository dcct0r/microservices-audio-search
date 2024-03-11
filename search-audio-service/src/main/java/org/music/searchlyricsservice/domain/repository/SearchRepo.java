package org.music.searchlyricsservice.domain.repository;

import org.music.searchlyricsservice.domain.model.Author;
import org.music.searchlyricsservice.domain.model.Song;

import java.util.Optional;

public interface SearchRepo {
    Optional<Song> findSongByName();
    Optional<Song> findSongByGenre();
    Optional<Author> finaAuthorByName();
    Optional<Author> finaAuthorByGenre();

}
