package com.company;

import java.util.Date;

public class Inscripcion {

    private Alumno unAlumno;
    private Curso unCurso;
    protected String fechaDeInscripcion;

    public Inscripcion(Alumno unAlumno, Curso unCurso, String fechaDeInscripcion) {
        super();
    }

    public String getFechaDeInscripcion() { return fechaDeInscripcion;  }

    public void setFechaDeInscripcion(String fechaDeInscripcion) { this.fechaDeInscripcion = fechaDeInscripcion; }

    protected Inscripcion (String Alumno, String Curso, String fechaDeInscripcion) {
        this.fechaDeInscripcion = fechaDeInscripcion;
    }

    public Inscripcion(String fechaDeInscripcion) {
        this.fechaDeInscripcion = fechaDeInscripcion;
    }
}
