/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author Esteban Cifuentes
 *
 */
public class Ecuacion {

	public static double solucionA(double a, double b, double c) {
		return (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}

	public static double solucionB(double a, double b, double c) {
		return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}
}
