/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Esteban Cifuentes
 */
public class Rombo {
    double lado;
    double diagonalMayor;
    double diagonalMenor;

    Rombo(double lado, double diagonalMenor, double diagonalMayor){
        this.lado=lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    double calcularArea(){
        return diagonalMenor *diagonalMayor/2;
    }
    double calcularPerimetro(){
        return lado*4;
    }
}
