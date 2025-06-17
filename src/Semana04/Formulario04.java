/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

import java.util.Random;

/**
 *
 * @author edumo
 */
public class Formulario04 {

    public static void main(String[] args) {

        final int tamaño = 3;

        int[][] matriz = new int[tamaño][tamaño];

        Random aleatorio = new Random();
        int contadorSeis = 0;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                //matriz[i][j] = aleatorio.nextInt(6) + 1;
                matriz[i][j] = (int)(Math.random()* 6 + 1);

                if (matriz[i][j] == 6) {
                    contadorSeis++;
                }
            }
        }

        // Imprimir los Datos
        System.out.println("Matriz generada: ");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Resultado del conteo
        System.out.println("\nEl numero 6 apareció " + contadorSeis + " veces.");
    }
}
