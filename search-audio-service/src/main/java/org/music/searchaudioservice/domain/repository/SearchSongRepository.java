package org.music.searchaudioservice.domain.repository;

import org.music.audioservice.domain.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SearchSongRepository extends JpaRepository<Song, UUID> {
    Song findSongByAuthorAndTitle(String author, String title);
    Optional<Song> findSongsByAuthor(String author);
    Optional<Song> findSongsByTitle(String title);
}
