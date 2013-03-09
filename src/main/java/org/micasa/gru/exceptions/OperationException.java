package org.micasa.gru.exceptions;

public class OperationException extends Exception {

    public OperationException(String message) {
        super(message);
    }

    public OperationException(String message, Throwable t) {
        super(message, t);
    }

    public OperationException(Throwable t) {
        super(t);
    }
}
