package org.music.searchlyricsservice.infrastracture.service;

import org.music.searchlyricsservice.domain.model.Song;
import org.music.searchlyricsservice.domain.repository.SearchSongRepository;
import org.music.searchlyricsservice.handler.errors.ErrorDescription;
import org.music.searchlyricsservice.handler.exceptions.NotFoundException;
import org.music.searchlyricsservice.service.SearchSongService;
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
