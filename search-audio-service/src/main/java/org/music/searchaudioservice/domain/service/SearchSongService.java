package org.music.searchaudioservice.domain.service;


import org.music.audioservice.domain.model.Song;

import java.util.Optional;

public interface SearchSongService {
    Song findSongByAuthorAndTitle(String author, String title);
    Optional<Song> findSongsByAuthor(String author);
    Optional<Song> findSongsByTitle(String title);
}
