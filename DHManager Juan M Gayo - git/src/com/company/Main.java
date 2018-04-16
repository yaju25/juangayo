package com.company;

import java.util.concurrent.Callable;

public class Main {


    public static void main(String[] args) {
        ProfesorTitular profesor1 = new ProfesorTitular ("Nico" , "Gomez", 12, 1);
        profesor1.setEspecialidad ( "ingles" );
        ProfesorTitular profesor2 = new ProfesorTitular ("Ariel", "Perez", 14 , 2);
        profesor2.setEspecialidad ( "matematica" );
        ProfesorAdjunto profesor3 = new ProfesorAdjunto ( "Pablo","Garcia",10,3 );
        profesor3.setCantidaDeHorasTrabajadas ( 4 );
        ProfesorAdjunto profesor4 = new ProfesorAdjunto ( "Juan","Fernandez",8,4);
        profesor3.setCantidaDeHorasTrabajadas ( 6 );
        Curso cursonuevo1 = new Curso ("Full Stack",20001,3);
        Curso cursonuevo2 = new Curso ( "Android", 20002, 2 );


    }
}
