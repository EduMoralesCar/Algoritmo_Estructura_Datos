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
public class RegistroEmpleados {

    public static void main(String[] args) {
        final int cantidad = 3;

        int[] dni = new int[cantidad];
        String[] cargos = new String[cantidad];
        int[] antiguedad = new int[cantidad];

        // Ingreso de Datos
        for (int i = 0; i < cantidad; i++) {
            dni[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del Empleado " + (i + 1) + ": "));
            cargos[i] = JOptionPane.showInputDialog("Ingrese el cargo del Empleado " + (i + 1) + ": ");
            antiguedad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de Antiguedad " + (i + 1) + ": "));
        }

        // Mostrar registros
        System.out.println("Registro de Empleados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("DNI: " + dni[i] + "\tCargo: " + cargos[i] + "\tAntiguedad: " + antiguedad[i] + " años");
        }

        System.out.println();
        //Busqueda por cargo exacto
        String cargoBuscar = JOptionPane.showInputDialog("¿Que cargo deseas buscar exactamente?");
        System.out.println("Empleado con el cargo de '" + cargoBuscar + "':");
        for (int i = 0; i < cantidad; i++) {
            if (cargos[i].equals(cargoBuscar)) {
                System.out.println("DNI: " + dni[i] + "\tCargo: " + cargos[i] + "\tAntiguedad: " + antiguedad[i] + " años");
            }
        }
    }
}
