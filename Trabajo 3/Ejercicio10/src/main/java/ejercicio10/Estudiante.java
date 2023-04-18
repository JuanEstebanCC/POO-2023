/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Esteban Cifuentes 
 */
public class Estudiante {

	public static double valor(double pat, double es) {
		double pagoMat = 50000;
		if ((pat > 2000000) && (es > 3)) {
			pagoMat = pagoMat + 0.03 * pat;

		}
		return pagoMat;
	}
}
