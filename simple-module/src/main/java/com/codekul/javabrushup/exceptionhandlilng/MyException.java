package com.codekul.javabrushup.exceptionhandlilng;

/**
 * Created by aniruddha on 9/11/16.
 */
public class MyException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Bad Number";
    }
}
