package com.ismael.moura.section_15.exercises.ex01.model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
