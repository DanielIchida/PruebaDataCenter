package com.datacenter.recargas.exeptions;

public class ErrorInsertInDatabaseException extends RuntimeException {
    public ErrorInsertInDatabaseException(Exception ex) {
        super(String.format("Error al insertar en la base de datos: %s",ex.getMessage()));
    }
}
