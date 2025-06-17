/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02.Ejercicio_01;

import javax.swing.JOptionPane;

/**
 *
 * @author edumo
 */
public class UnidimensionalArreglo {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero: "));
        int valor[] = new int [numero];
        for(int i=0; i<numero; i++){
            
            valor[i] = (int) (Math.random()*5+5);
            System.out.println("Arreglo " + i + " --> " + valor[i]);
        }
    }
    
    /*
        1.- Convierte el valor ingresado el Intenger.parseInt.
        2.- El Math.random genera un numero decimal de 0.0 y 0.9 (pero nunca 1.0)
        3.- Objetivo: Inicia un bucle for que recorre el arreglo desde 0 hasta numero-1.
        4.- Recorre el arreglo con un for y asigna un número aleatorio entre 5 y 19 a cada posición.
    */
    
    
}
