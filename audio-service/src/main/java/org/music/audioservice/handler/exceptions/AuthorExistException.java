package org.music.audioservice.handler.exceptions;

public class AuthorExistException extends RuntimeException {
    public AuthorExistException(String message) {
        super(message);
    }
}
