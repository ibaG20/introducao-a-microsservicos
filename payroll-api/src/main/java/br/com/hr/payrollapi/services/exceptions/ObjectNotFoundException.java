package br.com.hr.payrollapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String message){
        super(message);
    }
}
