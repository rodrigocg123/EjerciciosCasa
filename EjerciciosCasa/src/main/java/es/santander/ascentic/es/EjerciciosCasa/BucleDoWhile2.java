package es.santander.ascentic.es.EjerciciosCasa;

import javax.swing.*;
public class BucleDoWhile2 {
    public static void main(String[] args) {

        String genero="";

        do{
            genero=JOptionPane.showInputDialog("Introduce tu genero (H/M) ");
            //cogemos la variable String y introducimos el valor del JOPtionPane en la variable 


        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        //Si el valor introducido en el JOptionPane es distinto que una H/h o una M/m se sale automaticamente del Do y vuelve a entrar en bucle hasta que el valor sea correcto

        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm: ")); 
        //pasamos el valor de la altura a un valro de enteros
        int pesoideal= 0;
        //damos valor 0 al peso ideal cuando mas tarde se variara este valor al resultado de la operacion hecha en los if 

        if(genero.equalsIgnoreCase("H")){

            pesoideal=altura-110;

        }
        //si se introduce H se restara al valor introducido en altura 110
        else if(genero.equalsIgnoreCase("M")){

            pesoideal=altura-120;

        }
        //si se introduce una M se restara al valor introducido en altura 120

        System.out.println("Tu peso ideal es : "+ pesoideal + ".");
        // se plasma el resultado del final del suspuesto peso ideal de la persona 
    }
}
