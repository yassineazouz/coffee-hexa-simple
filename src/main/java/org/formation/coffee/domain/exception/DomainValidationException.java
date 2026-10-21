package org.formation.coffee.domain.exception;

public abstract class DomainValidationException extends DomainException {
    public DomainValidationException(String message){
        super(message);
    }
}