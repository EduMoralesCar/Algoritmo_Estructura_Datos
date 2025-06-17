/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

/**
 *
 * @author edumo
 */
public class Formulario01 {

    public static void main(String[] args) {
        int cantidad[][] = new int[40][1];
        int numero = 4;
        int acumulador = 0;

        // ASIGNACION DE DATOS
        for (int i = 0; i < cantidad.length; i++) {
            for (int j = 0; j < cantidad[i].length; j++) {
                cantidad[i][j] = numero;
                System.out.println(cantidad[i][j]);
                numero = numero + 3;
            }
        }

        // IMPRIMIR A LA PANTALLA
        for (int i = 0; i < cantidad.length; i++) {
            for (int j = 0; j < cantidad[i].length; j++) {
                acumulador = cantidad[i][j] + acumulador;
            }
        }
        
        System.out.println();
        System.out.println("La suma de los " + cantidad.length + " numeros es: " + acumulador);
        System.out.println("El promedio de los " + cantidad.length + " numeros es: " + acumulador/cantidad.length);
    }
}

