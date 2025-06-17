/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03;

import javax.swing.JOptionPane;

/**
 *
 * @author edumo
 */
public class RegistroEstudiantes {

    public static void main(String[] args) {
        final int registro = 5; // Definimos los registros

        String[] codigos = new String[registro];
        String[] nombres = new String[registro];
        double[] notas = new double[registro];

        // Registro de estudiantes
        for (int i = 0; i < registro; i++) {
            codigos[i] = JOptionPane.showInputDialog("Codigo de estudiante " + (i + 1));
            nombres[i] = JOptionPane.showInputDialog("Nombre del estudiante " + (i + 1));
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota del estudiante " + (i + 1)));
        }

        // Mostrar registros
        System.out.println("Registro de Estudiantes: ");

        for (int i = 0; i < registro; i++) {
            System.out.println("Código: " + codigos[i] + " Nombres: " + nombres[i] + " Notas: " + notas[i]);
        }

        System.out.println();        //Salto de linea

        
        // Búsqueda exacta por código
        System.out.println("Busqueda por Código y Nombre: ");

        String codigoBuscar = JOptionPane.showInputDialog("Buscar por código:");
        boolean encontrado = false;
        for (int i = 0; i < registro; i++) {
            if (codigos[i].equals(codigoBuscar)) {
                System.out.println("Encontrado -> Código: " + codigos[i] + ", Nombre: " + nombres[i] + ", Nota: " + notas[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Código no encontrado.");
        }

        // Búsqueda parcial por nombre
        String nombreBuscar = JOptionPane.showInputDialog("Buscar por nombre:");
        encontrado = false;
        for (int i = 0; i < registro; i++) {
            if (nombres[i].toLowerCase().contains(nombreBuscar.toLowerCase())) {
                System.out.println("Coincidencia -> Código: " + codigos[i] + ", Nombre: " + nombres[i] + ", Nota: " + notas[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron coincidencias por nombre.");
        }
    }
}
