package com.company;
import com.company.Profesor;


public class ProfesorTitular extends Profesor {
    private String especialidad;

    public ProfesorTitular (String nombre, String apellido, Integer antiguedad, Integer codigo){
        super (nombre,apellido,antiguedad,codigo);
    }
    public String getEspecialidad() { return especialidad;  }

    public void setEspecialidad(String especialidad) { this.especialidad = especialidad;}

    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigo, String especialidad) {
        super ( nombre, apellido, antiguedad, codigo );
        this.especialidad = especialidad;
    }
}
