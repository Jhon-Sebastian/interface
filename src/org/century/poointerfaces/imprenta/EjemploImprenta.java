package org.century.poointerfaces.imprenta;

import org.century.poointerfaces.imprenta.modelo.*;
import static org.century.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("Sebastian","Cagua")
                ,"Ing. Sistemas"
                ,"Resumen Laboral");

        cv.addExperiencia("Spring Boot").addExperiencia("Angular").addExperiencia("JWT");

        Libro libro = new Libro(new Persona("Luis","Carlos"),"El Gato Negro", Genero.DRAMA);
        libro.addPagina(new Pagina("Capitulo I"))
                .addPagina(new Pagina("Capitulo II"))
                .addPagina(new Pagina("Capitulo III"));

        Informe inf = new Informe(new Persona("Carlos","Vicente"),"Pedrito Juarez","Alguna Poesia...");


        imprimir(cv);
        imprimir(inf);
        imprimir(libro);

        //Clase anonima
        imprimir(new Imprimible() {
            
        });
        /*
             Imprimible im = new Imprimible(){
             };
             imprimir(im);
         */

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }

    /*
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
        System.out.println();
    }
    */
}
