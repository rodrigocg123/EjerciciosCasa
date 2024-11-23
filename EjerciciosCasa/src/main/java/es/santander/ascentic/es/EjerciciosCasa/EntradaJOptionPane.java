package es.santander.ascentic.es.EjerciciosCasa;

import javax.swing.*;

public class EntradaJOptionPane {
    public static void main (String[] args){
        String nombre_usuario= JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        //nueva funcion para que puedas introducir el nombre pero esta vez en vez de por linea de comandos por una interfaz

        String edad = JOptionPane.showInputDialog("Introduce la edad, Por favor: ");

        int edad_usuario=Integer.parseInt(edad);
        //transforma el String a ENTERO para que asi a la hora de operar el edad+1 coja el valor de un entero y pueda realizar la operacion y no cuenta el + como una concatenacion
        edad_usuario++;
        System.out.println("Hola " + nombre_usuario + " tu edad es de " + edad + " años, y el año que viene tendras " + edad_usuario+ " años." );
    }
}
