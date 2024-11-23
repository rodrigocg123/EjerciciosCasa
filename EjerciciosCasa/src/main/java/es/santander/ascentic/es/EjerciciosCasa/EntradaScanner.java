package es.santander.ascentic.es.EjerciciosCasa;
import java.util.*;
public class EntradaScanner {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor: ");
        String nombre_usuario=entrada.nextLine();//introduce en la consola nombres o frases... en este caso el nombre 

        System.out.println("Introduce tu edad, por favor: ");
        int edad=entrada.nextInt();//introduce a la consola enteros en este caso el valor de la edad 

        System.out.println("Hola " + nombre_usuario + ", el año que viene tendras " + (edad+1) + " años." ); 
        //devuelve el valor de los años que tendras el año que viene
    }
    
    
}
