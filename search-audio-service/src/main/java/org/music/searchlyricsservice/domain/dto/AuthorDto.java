package org.music.searchlyricsservice.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AuthorDto {
    private String firstName;
    private String lastName;
    private String citizenship;
    private Integer careerStart;
    private Date birthday;
    private String male;
    private String genre;
}
