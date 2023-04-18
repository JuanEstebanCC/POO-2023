/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Esteban Cifuentes 
 */
public class Rectangulo {
    double base;
    double altura;

    Rectangulo(double base, double altura){
        this.base=base;
        this.altura =altura;
    }
    double calcularArea(){
        return base*altura;
    }
    double calcularPerimetro(){
        return (base*2)+(altura*2);
    }
}
