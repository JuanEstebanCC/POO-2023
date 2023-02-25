package org.poo2023;
/* Hacer prueba de Escritorio del siguiente grupo de Instrucciones*/
public class Ejercicio2 {
    public static void main(String[] args) {
        double sum=0, x=20, y=40;
        sum=sum+x;
        x=x+Math.pow(y, 2);
        sum=sum+x/y;
        System.out.print("La suma es:"+sum);
    }
}