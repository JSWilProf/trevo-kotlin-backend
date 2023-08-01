package br.senai.informatica.trevo.components;

public class DataInvalidException extends DataException {
    public DataInvalidException(String message) {
        super(message);
    }

    public DataInvalidException(String message, Throwable cause) {
        super(message, cause);
    }
}
