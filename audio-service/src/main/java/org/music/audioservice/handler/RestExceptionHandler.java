package org.music.audioservice.handler;

import org.music.audioservice.handler.exceptions.SongNotFoundException;
import org.music.audioservice.handler.exceptions.SongExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(SongNotFoundException.class)
    public ResponseEntity<ErrorMessage> songNotFoundException(SongNotFoundException songNotFoundException) {
        ErrorMessage errorMessage = new ErrorMessage(songNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SongExistException.class)
    public ResponseEntity<ErrorMessage> songExistException(SongExistException songExistException) {
        ErrorMessage errorMessage = new ErrorMessage(songExistException.getMessage(), HttpStatus.CONFLICT);
        return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);
    }
}
