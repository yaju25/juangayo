package com.company;

public abstract class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigo;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigo) {
        super ();
    }

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

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Profesor)) {
            return false;
        } else (this.codigo.equals ( codigoAComparar ( getCodigo () ) 
    }
}

        protected abstract Integer codigoAComparar(Integer codigo);{

        


    private Integer codigoAComparar(Integer codigo) {
    }
}
