package com.epam.mjc;

public class NotFoundStudentException extends IllegalArgumentException{
    public NotFoundStudentException (String message){
        super(message);
    }
}
