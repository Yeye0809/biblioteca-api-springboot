package com.yeferson.biblioteca_api.exception;

public class LibroNoEncontrado extends RuntimeException{
    public LibroNoEncontrado(String mensaje){
        super(mensaje);
    }
}
