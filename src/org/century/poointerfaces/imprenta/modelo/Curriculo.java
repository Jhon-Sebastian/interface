package org.century.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String exp){
        this.experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.persona.getNombre()).append("\n")
          .append("Resumen: ").append(this.contenido).append("\n")
          .append("Profesion: ").append(this.carrera).append("\n")
          .append("Experiencias: \n");
        for(String i : this.experiencias){
            sb.append("- ").append(i).append("\n");
        }
        return sb.toString();
    }
}
