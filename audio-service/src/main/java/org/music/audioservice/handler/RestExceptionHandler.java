package org.music.audioservice.handler;

import org.music.audioservice.handler.exceptions.AuthorExistException;
import org.music.audioservice.handler.exceptions.AuthorNotFoundException;
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

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity<ErrorMessage> authorNotFoundException(AuthorNotFoundException authorNotFoundException) {
        ErrorMessage errorMessage = new ErrorMessage(authorNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AuthorExistException.class)
    public ResponseEntity<ErrorMessage> songExistException(AuthorExistException authorExistException) {
        ErrorMessage errorMessage = new ErrorMessage(authorExistException.getMessage(), HttpStatus.CONFLICT);
        return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);
    }
}
