package com.company;
import com.company.Profesor;

public class ProfesorAdjunto extends Profesor{

    private Integer cantidaDeHorasTrabajadas;

    public Integer getCantidaDeHorasTrabajadas() {
        return cantidaDeHorasTrabajadas;
    }
    public void setCantidaDeHorasTrabajadas(Integer cantidaDeHorasTrabajadas) {
        this.cantidaDeHorasTrabajadas = cantidaDeHorasTrabajadas;
    }
    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigo) {
        super ( nombre, apellido, antiguedad, codigo );
    }

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigo, Integer horasTrabajadas) {
        super ( nombre, apellido, antiguedad, codigo );
        this.cantidaDeHorasTrabajadas = horasTrabajadas;
    }
}
