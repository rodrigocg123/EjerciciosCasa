package es.santander.ascentic.es.EjerciciosCasa;
import javax.swing.*;

public class EntradaNumeros {
    public static void main(String[] args){
        double x=10000.0;
        System.out.printf("%1.3f",x/3);//reducir numero de decimales
    String num1=JOptionPane.showInputDialog("introduce un numero: ");

    Double num2=Double.parseDouble(num1);//transforma a double para permitir decilmales.
    System.out.print("la raiz de " + num2 + "es: " );
    System.out.printf("%1.2f", Math.sqrt(num2));
    //devuelve la raiz cuadrada del numero asignado a la variable pero solo con dos decimales por la funcion "%1.2"
    }
}
