package org.music.searchlyricsservice.service;

import org.music.searchlyricsservice.domain.model.Song;

import java.util.Optional;

public interface SearchSongService {
    Song findSongByAuthorAndTitle(String author, String title);
    Optional<Song> findSongsByTitle(String title);
}
