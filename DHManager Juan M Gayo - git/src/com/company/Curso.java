package com.company;

import java.util.*;

public class  Curso {
    private String nombre;
    private Integer codigo;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> alumnoList;
    public ProfesorTitular unprofesorTitular;
    public ProfesorAdjunto unprofesorAdjunto;

    public Curso(String nombre, Integer codigo, int cupoMaximoDeAlumnos, List<Alumno> alumnoList, ProfesorTitular unprofesorTitular, ProfesorAdjunto unprofesorAdjunto)  {
        super();
    }
    public Curso(String nombre, Integer cuposDeAlumnosMaximo, Integer codigo) {
        super();
    }
    public String getNombre() {return nombre;  }

    public void setNombre(String nombre) {this.nombre = nombre; }

    public Integer getCodigo() {return codigo; }

    public void setCodigo(Integer codigo) { this.codigo = codigo;}

    public Integer getCuposDeAlumnosMaximo() {  return cupoMaximoDeAlumnos; }

    public void setCuposDeAlumnosMaximo(Integer cupoMaximoDeAlumnos) {
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
    }
    public List<Alumno> getAlumnoList() {return alumnoList;}

    public void setAlumnoList(List<Alumno> alumnoList) {this.alumnoList = alumnoList; }

    public Boolean agregarUnAlumno(Alumno unAlumno) {
        if (cupoMaximoDeAlumnos > alumnoList ( cupoMaximoDeAlumnos )) ;
        alumnoList.add ( unAlumno );
        return true;
    }
    private Integer alumnoList(Integer cupoMaximoDeAlumnos) {
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
        return cupoMaximoDeAlumnos;
    }

}

