package org.music.audioservice.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ErrorMessage {
    private String description;
    private HttpStatus statusCode;
}
