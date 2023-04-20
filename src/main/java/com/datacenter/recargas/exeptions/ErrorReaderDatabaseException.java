package com.datacenter.recargas.exeptions;

public class ErrorReaderDatabaseException extends RuntimeException {
    public ErrorReaderDatabaseException(Exception ex) {
        super(String.format("Error al consultarr en la base de datos: %s",ex.getMessage()));
    }
}
