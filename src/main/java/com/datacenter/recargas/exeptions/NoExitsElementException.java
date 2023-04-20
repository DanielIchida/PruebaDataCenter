package com.datacenter.recargas.exeptions;

public class NoExitsElementException extends RuntimeException {
    public NoExitsElementException(String entity,Long id){
        super(String.format("%s with Id %d not found",entity,id));
    }
}
