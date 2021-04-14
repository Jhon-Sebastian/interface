package org.century.poointerfaces.imprenta.modelo;

public enum Genero {

    DRAMA("Drama"),
    ACCION("Accion"),
    AVENTURA("Aventura"),
    TERROR("Terror"),
    CIENCIA_FICCION("Ciencia Ficcion");

    private final String tipo;


    Genero(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
