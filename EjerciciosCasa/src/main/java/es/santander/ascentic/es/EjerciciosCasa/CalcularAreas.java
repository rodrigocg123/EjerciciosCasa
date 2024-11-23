package es.santander.ascentic.es.EjerciciosCasa;
import java.util.*;
import javax.swing.*;
public class CalcularAreas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Círculo" ); 
        //el \n sirve para imprimir el texto que continua detras de ella una lina mas abajo

        int figura=entrada.nextInt();

        switch(figura){
            case 1:
            int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
            System.out.println("El area del cuadrado es: "+ Math.pow(lado, 2));//lado*lado
            break;//con esta funcion se sale del programa para que no ejecute los siguientes en el caso de que entre en esta seccion case
            case 2:
            int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:" ));
            int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
            System.out.println("El area del rectangulo es: " + base*altura);
            break;
            case 3:
            base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:" ));
            altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
            System.out.println("El area del triangulo es:" + (base*altura)/2);
            break;
            case 4:
            int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:" ));
            System.out.print("El area del circulo es: " );
            System.out.printf("%1.3f", Math.PI*Math.pow(radio,2));
            break; 
            default:
            System.out.println("La opcion no es correcta.");
        }
    }
}
