/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana06;

/**
 *
 * @author edumo
 */
public class Pokemon {

    private String nombre;
    private int nivel;
    private double poderAtaque;

    public Pokemon(String nombre, int nivel, double poderAtaque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.poderAtaque = poderAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    @Override
    public String toString() {
        return nombre + " (Nivel: " + nivel + ", Poder: " + poderAtaque + ")";
    }
}
