package es.santander.ascentic.es.EjerciciosCasa;

public class ClaseString {
    public static void main(String args[]){

        String nombre="Rodrigo";

        System.out.println("Mi nombre es " + nombre + ".");

        System.out.println("Mi nombre tiene " + nombre.length() + " letras");

        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0) + ".");

        int ultima_letra;
        ultima_letra=nombre.length();
        System.out.println("La ultima letra de mi nombre es " + nombre.charAt(ultima_letra-1) + "."); 
        /* Utiliza el punto length para que me diga las letras de mi nombre y aplica la varibable ultima_letra le pongo un menos para que reste 
        un numero a el valor dado ya que el charAt empieza a contar desde 0 y me plasma la ultima letra de mi nombre
        */




        
    }
}
