/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Esteban Cifuentes 
 */
public class Cuadrado {
    double lado;

    Cuadrado(double lado){
        this.lado =lado;
    }

    double calcularArea(){
        return lado*lado;

    }

    double calcularPerimetro(){
        return (lado*4);
    }
}
