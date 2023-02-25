package org.poo2023;
/*Elabore un algoritmo que lea un numero y obtenga su cuadrado y su cubo*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        double num, cuadrado, cubo;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        num = teclado.nextDouble();
        cuadrado =  Math.pow(num, 2);
        cubo = Math.pow(num, 3);
        System.out.println("El cuadrado del número es: "+cuadrado+"\nEl cubo del número es: "+cubo);
    }
}