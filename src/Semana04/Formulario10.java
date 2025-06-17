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
public class Formulario10 {

    public static void main(String[] args) {

        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño: "));

        String[][] figura = new String[tamaño][tamaño];

        for (int i = 0; i < figura.length; i++) {
            for (int j = 0; j < figura[i].length; j++) {
                if (i == j || i + j == tamaño - 1) {
                    figura[i][j] = "*";
                } else {
                    figura[i][j] = " ";
                }
                System.out.print(figura[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
