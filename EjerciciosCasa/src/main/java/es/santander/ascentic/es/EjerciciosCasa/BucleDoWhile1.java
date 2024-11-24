package es.santander.ascentic.es.EjerciciosCasa;

import java.util.Scanner;

public class BucleDoWhile1 {
    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*100);//genera un numero aleatorio
        
        Scanner entrada = new Scanner(System.in);
        //declaramos la variable scanner con el System.in para que el valor que demos a entrada no lo plasme sino que lo introduzca dentro del sistema
        
        int numero=0 , intentos=0;

        do{
            intentos++;
            System.out.println("Introduce un numero, por favor: ");
            numero=entrada.nextInt();//la variable numero tiene que ser igual al numero introducido por consola
            if(aleatorio<numero){
                //si el numero es mas bajo que el aleatorio entrara en este if y te dira que el numero es mas bajo
                System.out.println("Mas bajo.");
    
            }
            else if(aleatorio>numero){
                //si el numero que introduces es mas bajo que el aleatorio entrara en este if y te dira que el numero es mas alto 
                System.out.println("Mas alto.");
            }
        }while(numero!=aleatorio);
        //el bucle do{}while primero ejecuta el codigo y luego comprueba si la condicion se cumple
    System.out.println("Correcto, lo has conseguido en "+ intentos + " intentos.");
        //Este System se ejecutara cuando se acierte el numero
    }
}
