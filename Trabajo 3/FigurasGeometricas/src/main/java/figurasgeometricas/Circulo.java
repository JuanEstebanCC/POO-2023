/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author  Esteban Cifuentes
 */
public class Circulo {
    double radio;
    
    Circulo(double radio) {
    this.radio = radio;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(this.radio, 2);
    }
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
