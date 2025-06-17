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
public class Formulario06 {

    public static void main(String[] args) {
        
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del cuadrado:"));
        char[][] figura = new char[tamaño][tamaño];

        // ASIGNACION DE DATOS CON *
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                figura[i][j] = '*';
            }
        }

        // IMPRIMIR A LA PANTALLA
        System.out.println("Figura del cuadrado:");
        System.out.println();
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(figura[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
