package org.poo2023;
/*
Dado el radio de un circulo. Haga un algoritmo que obtenga el area del circulo y la
longitud de la circuferencia
*/
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        double radio, longitud, area;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        radio=teclado.nextDouble();
        area=Math.pow(radio,2)*Math.PI;
        longitud=2*Math.PI*radio;
        System.out.println("El area del circulo es: "+area+"\nLa longitud de la circunferencia del circulo es: "+longitud);
    }
}