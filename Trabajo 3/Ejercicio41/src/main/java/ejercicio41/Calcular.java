/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio41;

import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Esteban Cifuentes 
 */
public class Calcular {
    public static boolean isNumeric(String str)
    {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    public static double NumMasGrande(JList<String> lista) {
        double[] numeros = new double[lista.getModel().getSize()];
        for (int i = 0; i < lista.getModel().getSize(); i++) {
            String str = lista.getModel().getElementAt(i);
            numeros[i] = Double.parseDouble(str);
        }
        double mayor = numeros[0];
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > mayor) {
                mayor = numeros[x];
            }
        }
        return mayor;
    }
}

