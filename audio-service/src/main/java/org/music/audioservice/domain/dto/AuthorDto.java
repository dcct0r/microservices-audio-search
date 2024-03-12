package org.music.audioservice.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AuthorDto {
    private String firstname;
    private String lastname;
    private String citizenship;
    private Integer careerStart;
    private Date birthday;
    private String male;
    private String genre;
}
