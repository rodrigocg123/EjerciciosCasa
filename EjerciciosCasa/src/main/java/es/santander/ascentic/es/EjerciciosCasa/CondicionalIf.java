package es.santander.ascentic.es.EjerciciosCasa;

import java.util.Scanner;

public class CondicionalIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor: ");
        int edad1 = entrada.nextInt();
        if(edad1>=18){
            System.out.println("Eres mayor de edad ");
            //si se cumple la funcion del if ejecuta esta clase 
        }
        else{
            System.out.println("Eres menor de edad "); 
            //si no se cumple la funcion del if imprime la frase del else
        }
        if(edad1<18){

            System.out.println("Eres un adolescente ");
            //si eres menos de 18 imprime esto
        }
        else if(edad1<40){

            System.out.println("Eres joven");
            //si es menor de 40 esto
        }
        else if(edad1<65){

            System.out.println("Eres maduro");
            //si eres menor de 65 esto
        }
        else {

            System.out.println("Cuidate");
            //si no se cumple ninguna de las anteriores ejecuta esta
        }

    }
}
