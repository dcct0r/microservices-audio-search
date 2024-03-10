package org.music.audioservice.domain.repository;

import org.music.audioservice.domain.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SongRepository extends JpaRepository<Song, UUID> {
}
