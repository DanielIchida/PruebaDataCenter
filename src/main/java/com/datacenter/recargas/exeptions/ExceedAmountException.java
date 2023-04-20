package com.datacenter.recargas.exeptions;

public class ExceedAmountException extends RuntimeException {

    public ExceedAmountException() {
        super("Excede el monto");
    }

}
