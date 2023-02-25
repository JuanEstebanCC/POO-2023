package org.poo2023;
/*
Un empleado trabaja 48 horas en la semana a razon de $5.000 hora. El porcentaje de
retencion en la fuente es del 12.5% del salario bruto. Se desea saber cual es el salario bruto,
la retencion en la fuente y el salario neto del trabajador.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        double  valueHour=5000, hours=48, valSalBruto, valReten, valSalNet;
        valSalBruto=hours*valueHour;
        valReten=valSalBruto*0.125;
        valSalNet=valSalBruto-valReten;
        System.out.println("Su salario bruto es: "+valSalBruto+"\nSu retención de la fuente: "+valReten+"\nSu salario neto es: "+valSalNet);
    }
}