/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana04;

import javax.swing.JOptionPane;

/**
 *
 * @author edumo
 */
public class ArreglosBidimensionales {

    public static void main(String[] args) {
        int[][] numeros = new int[4][4];

        //Asignación de Datos
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para [" + i + "][" + j + "]:"));
                numeros[i][j] = cantidad;
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        /*
        // Imprimir en la consola
        System.out.println("Matriz ingresada: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
         */
    }

}
