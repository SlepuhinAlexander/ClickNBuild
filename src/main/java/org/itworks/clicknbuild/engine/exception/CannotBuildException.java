package org.itworks.clicknbuild.engine.exception;

public class CannotBuildException extends RuntimeException {
    public CannotBuildException() {
    }

    public CannotBuildException(String message) {
        super(message);
    }

    public CannotBuildException(String message, Throwable cause) {
        super(message, cause);
    }
}
