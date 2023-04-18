/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio22;

/**
 *
 * @author Esteban Cifuentes
 */
public class Calculo {

	public static String calcular(double salBase, double num, String nombre) {
		double salario;
		salario = salBase * num;
		if (salario > 450000) {
			return (nombre + " tiene un salario de: " + salario);
		} else {
			return (nombre);
		}
	}
}
