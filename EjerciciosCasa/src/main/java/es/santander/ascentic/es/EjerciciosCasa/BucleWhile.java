package es.santander.ascentic.es.EjerciciosCasa;

import java.util.Scanner;
import javax.swing.*;
public class BucleWhile {
    public static void main(String[] args) {
        String clave="1234";//contraseña que va a tener que introducir

        String pass="";//Almacena con una cadena vacia que luego va a ser la que almacene lo que se introduzca el JOPtionPane
         while (clave.equals(pass)==false) {
            //como la variable clave y class no son iguales se cumple la condicion del while y entra en el 
            pass=JOptionPane.showInputDialog("Introduce la contraseña por favor: ");
            //abre la cajita en interfaz donde tienes que introducir la contraseña
            if(clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta.");
            }
            //si se introduce mal la contraseña el programa entrada en el bucle if y hara el System.out.println y introducira el contraseña incorrecta
            //y volvera a salir la cajita del JOptionPane hasta que la contraseña sea correcta.

         }
    System.out.println("Contraseña correcta acceso permitido");

    }
}
