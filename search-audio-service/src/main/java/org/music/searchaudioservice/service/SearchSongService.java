package org.music.searchaudioservice.service;

import org.music.searchaudioservice.domain.model.Song;

import java.util.Optional;

public interface SearchSongService {
    Song findSongByAuthorAndTitle(String author, String title);
    Optional<Song> findSongsByTitle(String title);
}
