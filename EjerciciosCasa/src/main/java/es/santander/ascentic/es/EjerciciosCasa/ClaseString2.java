package es.santander.ascentic.es.EjerciciosCasa;

public class ClaseString2 {
    public static void main(String args[]){
        String frase="Hoy es un estupendo dia para aprender a programar en java";

        String frase_resumen=frase.substring(0,3);
        //con la primera posicion indico que quiero empezar a extraer desde la letra o y con la segunda posicion indico que quiero que corte la extraccion con el espacio en blanco tras la y
        System.out.println(frase_resumen);
        String frase_resumen2=frase.substring(29,57); 
        //este es el mismo metodo que el anterior empleado pero con un fragmento de la frase distinto que el anterior.
        System.out.println(frase_resumen2);
        String frase_resumen3=frase.substring(0,29) + "irnos a la playa y olvidarnos de todo";//concatenamos un nuevo segmentos que sera añadido a la frase
        System.out.println(frase_resumen3);
    }
}
