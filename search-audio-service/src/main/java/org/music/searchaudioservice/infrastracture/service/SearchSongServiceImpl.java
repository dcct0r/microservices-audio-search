package org.music.searchaudioservice.infrastracture.service;

import org.music.audioservice.domain.model.Song;
import org.music.searchaudioservice.domain.repository.SearchSongRepository;
import org.music.searchaudioservice.handler.errors.ErrorDescription;
import org.music.searchaudioservice.handler.exceptions.NotFoundException;
import org.music.searchaudioservice.service.SearchSongService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SearchSongServiceImpl implements SearchSongService {

    private final SearchSongRepository songRepository;

    public SearchSongServiceImpl(SearchSongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song findSongByAuthorAndTitle(String author, String title) {
        Song song = songRepository.findSongByAuthorAndTitle(author, title);
        if (song == null) throw new NotFoundException(ErrorDescription.nameOrTitleNotFoundException);
        return songRepository.findSongByAuthorAndTitle(author, title);
    }

    @Override
    public Optional<Song> findSongsByTitle(String title) {
        Optional<Song> song = songRepository.findSongsByTitle(title);
        return Optional.ofNullable(song.stream()
                .findAny()
                .orElseThrow(() -> new NotFoundException(ErrorDescription.titleNotFoundException)));
    }
}
