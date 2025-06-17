/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

/**
 *
 * @author edumo
 */
import javax.swing.JOptionPane;

public class Formulario07 {

    public static void main(String[] args) {
        // Definir los arreglos paralelos con 5 registros
        String[] codigos = {"A001", "A002", "A003", "A004", "A005"};
        String[] nombres = {"Juan Pérez", "María García", "Carlos López", "Ana Martínez", "Luis Rodríguez"};
        double[] notas = {4.5, 3.8, 4.2, 4.0, 3.9};

        while (true) {
            // Mostrar menú de opciones
            String opcion = JOptionPane.showInputDialog(
                    "BUSQUEDA DE ESTUDIANTES\n\n"
                    + "1. Buscar por código\n"
                    + "2. Salir\n\n"
                    + "Seleccione una opción:");

            if (opcion == null || opcion.equals("2")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }

            if (opcion.equals("1")) {
                buscarPorCodigo(codigos, nombres, notas);
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void buscarPorCodigo(String[] codigos, String[] nombres, double[] notas) {
        String codigoBuscado = JOptionPane.showInputDialog("Ingrese el código del estudiante:");

        if (codigoBuscado == null) {
            return; // Si el usuario cancela
        }
        boolean encontrado = false;
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i].equals(codigoBuscado)) {
                resultado.append("REGISTRO ENCONTRADO\n\n");
                resultado.append("Código: ").append(codigos[i]).append("\n");
                resultado.append("Nombre: ").append(nombres[i]).append("\n");
                resultado.append("Nota: ").append(notas[i]).append("\n");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            resultado.append("No se encontró ningún estudiante con el código: ").append(codigoBuscado);
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
