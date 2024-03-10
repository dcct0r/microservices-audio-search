package org.music.audioservice.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SongDto {
    private String songName;
    private String authorName;
    private String description;
}
