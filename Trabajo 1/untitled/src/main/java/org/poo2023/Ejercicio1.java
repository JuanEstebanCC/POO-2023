package org.poo2023;
/*
A la mama de Juan le preguntan su edad, y contesta: tengo 3 hijos, preguntele a Juan su
edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
Ia suma de las tres. Hacer un algoritmo qué muestre Ia edad de los cuatro.
*/
import java.util.Scanner;

public class Ejercicio1{
        public static void main(String[] args) {
            int edadJuan, edadAlb, edadAna, edadMama;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Por favor, ingrese la edad Juan: ");
            edadJuan=teclado.nextInt();
            edadAlb=edadJuan*2/3;
            edadAna=edadJuan*4/3;
            edadMama=edadJuan+edadAlb+edadAna;
            System.out.println("La edad de Juan es: "+edadJuan+"\nLa edad de Alberto es: "+edadAlb+"\nLa edad de Ana es: "+edadAna+"\nLa edad de la madre es: "+edadMama);
        }
}