/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author santi
 */
public class Numero {
	public static String calcular(double a, double b){
        if (a>b){
            return "Mayor";
        }
        else if (a<b){
            return "Menor";
        }
        else{
            return "Igual";
        }
    }
}
