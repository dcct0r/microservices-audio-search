package org.music.searchlyricsservice.handler;

import org.music.searchlyricsservice.handler.exceptions.GenreNotFoundException;
import org.music.searchlyricsservice.handler.exceptions.NameNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NameNotFoundException.class)
    public ResponseEntity<ErrorMessage> songNotFoundException(NameNotFoundException nameNotFoundException) {
        ErrorMessage errorMessage = new ErrorMessage(nameNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(GenreNotFoundException.class)
    public ResponseEntity<ErrorMessage> authorNotFoundException(GenreNotFoundException genreNotFoundException) {
        ErrorMessage errorMessage = new ErrorMessage(genreNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }
}
