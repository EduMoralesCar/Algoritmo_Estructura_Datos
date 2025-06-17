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
public class InventarioProductos {

    public static void main(String[] args) {
        // Arreglos paralelos
        int[] codigos = {101, 102, 103, 104, 105};
        String[] nombres = {"Laptop", "Mouse", "Teclado", "Monitor", "USB"};
        double[] precios = {2500.0, 50.0, 120.0, 800.0, 30.0};
        int[] stocks = {10, 3, 2, 7, 1};

        // Realizamos el listado de los Arreglos
        System.out.println("Listado de los Productos: ");
        for (int i = 0; i < codigos.length; i++) {
            System.out.println("ID: " + codigos[i] + "\tNombre: " + nombres[i] + "\tPrecio: " + precios[i] + "\tStocks: " + stocks[i]);
        }

        // Busqueda por Rango de Precios
        double precioMin = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio mínimo:"));
        double precioMax = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio máximo:"));
        System.out.println();
        System.out.println("Productos entre s/" + precioMin + " y s/" + precioMax + ":");
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] >= precioMin && precios[i] <= precioMax) {
                System.out.println("ID: " + codigos[i] + "\tNombre: " + nombres[i] + "\tPrecio: S/ " + precios[i]);
            }
        }

        // Busqueda por stock Critico
        int busquedaStock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Stock critico:"));
        System.out.println();
        System.out.println("El Stock critico ingresado fue el " + busquedaStock + ", los cuales pertenecen a los productos: ");
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] < busquedaStock) {
                System.out.println("ID: " + codigos[i] + "\tNombre: " + nombres[i] + "\tPrecio: " + precios[i] + "\tStocks: " + stocks[i]);
            }
        }
    }

}
