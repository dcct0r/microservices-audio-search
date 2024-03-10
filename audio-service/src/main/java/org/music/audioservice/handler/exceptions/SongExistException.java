package org.music.audioservice.handler.exceptions;

public class SongExistException extends RuntimeException {
    public SongExistException(String message) {
        super(message);
    }
}
