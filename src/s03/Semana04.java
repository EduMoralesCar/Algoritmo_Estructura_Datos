/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s03;

import javax.swing.JOptionPane;

public class Semana04 {

    public static void main(String[] args) {
        
      String Cuadrado [][] = new String [7][7];
      
      for (int i = 0; i < Cuadrado.length; i++) {
            for (int j = 0; j < Cuadrado[0].length; j++) {
                Cuadrado[i][j] =" "; 
            }
      }
      
        for (int i = 0; i < Cuadrado.length; i++) {
            for (int j = 0; j < Cuadrado[0].length; j++) {
                
             //   Cuadrado[i][j] = Integer.parseInt(JOptionPane.showInputDialog("INGRESA NUMERO:"));
             //if(j==Cuadrado.length-1)
                Cuadrado[i][Cuadrado.length-1]="X";     //ultima columna
                Cuadrado[i][0]="X";                     //primera columna
                Cuadrado[Cuadrado.length-1][j]="X";     //ultima fila
                Cuadrado[0][j]="X";                     //primera fila
                
                Cuadrado[Cuadrado.length/2][j]="X";     //fila del medio
                
                if(j==i)
                Cuadrado[i][j]="X";                     // diagonal principal
                
                
                if(i+j==Cuadrado.length-1)              //diagonal secundario
                Cuadrado[i][j]="X";
                
             System.out.print(Cuadrado[i][j] + " ");
            }
            System.out.println(" ");
        }
      
    }
    
}
