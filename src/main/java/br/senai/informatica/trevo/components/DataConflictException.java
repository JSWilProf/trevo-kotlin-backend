package br.senai.informatica.trevo.components;

public class DataConflictException extends DataException {
    public DataConflictException(String message) {
        super(message);
    }

    public DataConflictException(String message, Throwable cause) {
        super(message, cause);
    }
}
