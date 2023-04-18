/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author Esteban Cifuentes
 */
public class Triangulo {

	public static double calPerimetro(double lado) {
		double perimetro;
		perimetro = lado * 3;
		return perimetro;
	}

	public static double calAltura(double lado) {
		double altura;
		altura = Math.round((Math.sqrt(3) / 2 * lado));
		return altura;
	}

	public static double calArea(double lado) {
		double area;
		area = Math.round((lado * (Math.sqrt(3) / 2 * lado)) / 2);
		return area;
	}
}
