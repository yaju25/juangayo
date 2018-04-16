package com.company;

public abstract class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Alumno(String nombre, String apellido, Integer codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }


}



