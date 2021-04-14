package org.century.poointerfaces.imprenta.modelo;

import org.w3c.dom.ls.LSOutput;

public abstract class Hoja {

    //Interfaces reunen objetos que hacen lo mismo sin importar como


    //Las clases abstractas se usan cuando hay una relacion de parentesco

    /*  Las interfaces es cuando son comunes por lo que hacen pero no como
        Ej:  Hoja puede ser una clase abstracta donde puede tener hijos
             como informe, curriculo y los cuales tiene en comun un metodo
             imprimir, pero si no tiene parentezco como un libro o revista
             se usan interfaces ya que todos buscan imprimir pero sin parentezco
             se pueden implementar como quieran sin ser parientes y permiten
             mucha mas flexibilidad
     */
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract String imprimir();

}
