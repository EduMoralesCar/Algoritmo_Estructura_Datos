/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

import javax.swing.JOptionPane;

/**
 *
 * @author edumo
 */
public class Formulario05 {

    public static void main(String[] args) {
        int letra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del 'X': "));

        char[][] figura = new char[letra][letra];

        //INICIALIZAMOS LOS DATOS CON *
        for (int i = 0; i < letra; i++) {
            for (int j = 0; j < letra; j++) {
                if (i == j || i + j == letra - 1) {
                    figura[i][j] = '*';
                } else {
                    figura[i][j] = ' ';
                }
            }
        }

        // IMPRIMIR A LA PANTALLA
        System.out.println("Figura de una 'X' de Tamaño: " + figura.length);
        System.out.println();
        for (int i = 0; i < letra; i++) {
            for (int j = 0; j < letra; j++) {
                System.out.print(figura[i][j] + " ");
            }
            System.out.println();
        }
    }
}
