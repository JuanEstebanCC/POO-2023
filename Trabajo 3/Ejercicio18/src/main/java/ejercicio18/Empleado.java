/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author Esteban Cifuentes 
 */
public class Empleado {
	
	public static double calSalBruto(double horas, double valor){
          double salBruto;
	  salBruto = horas*valor;
	  return salBruto;
	}
	public static double calSalNeto(double horas, double valor, double porcentaje){
          double salNeto;
	  double salBruto;
	  salBruto = horas*valor;
	  salNeto = salBruto*(1-(porcentaje/100));
	  return salNeto;
	}
}
