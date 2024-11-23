package es.santander.ascentic.es.EjerciciosCasa;

public class ClaseString3 {
    public static void main(String args[]) {
        String alumno1, alumno2;

        alumno1="Alex";
        alumno2="alex";

        System.out.println(alumno1.equals(alumno2));//esta incluye letras mayusculas y minusculas
        System.out.println(alumno1.equalsIgnoreCase(alumno2));//esta ignora las letras mayusculas y minusculas
        
        String alumno3, alumno4;

        alumno3="Jorge";
        alumno4="Minguito";

        System.out.println(alumno3.equals(alumno4));


    }   
}
