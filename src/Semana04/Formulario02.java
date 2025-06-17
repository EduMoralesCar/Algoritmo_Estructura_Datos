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
public class Formulario02 {

    public static void main(String[] args) {
        int nuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número máximo (1 a 9):"));
        
        int[][] numero = new int[nuevo][nuevo];
        
        // LLENAMOS LA MATRIZ
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = j + 1;
            }
        }

        //IMPRIMIMOS LAS FILAS
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length - i; j++) {
                System.out.print(numero[i][j]);
            }
            System.out.println();
        }
    }
}
