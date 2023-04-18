/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Esteban Cifuentes 
 */
public class Trapecio {
    double altura;
    double baseMayor;
    double baseMenor;

    Trapecio(double basemayor, double basemenor, double altura){
        this.altura=altura;
        this.baseMayor = basemayor;
        this.baseMenor = basemenor;
    }
    double calcularArea(){
        return ((baseMayor + baseMenor))/2*altura;
    }
    double calcularPerimetro(){
        return (baseMayor + baseMenor +(determinarHipotenusa())+(determinarHipotenusa()));
    }
    double determinarHipotenusa(){
        return Math.pow(((baseMayor-baseMenor)/2)*((baseMayor-baseMenor)/2)+altura*altura, 0.5);
    }
}
