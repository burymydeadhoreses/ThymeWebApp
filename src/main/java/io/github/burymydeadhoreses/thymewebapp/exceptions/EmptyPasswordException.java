package io.github.burymydeadhoreses.thymewebapp.exceptions;

public class EmptyPasswordException extends RuntimeException {
    public EmptyPasswordException(String message) {
        super(message);
    }
}

