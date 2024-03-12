package org.music.searchlyricsservice.domain.repository;

import org.music.searchlyricsservice.domain.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SearchSongRepository extends JpaRepository<Song, UUID> {
    Song findSongByAuthorAndTitle(String author, String title);
    Optional<Song> findSongsByTitle(String title);
}
