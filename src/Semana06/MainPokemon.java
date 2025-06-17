/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana06;

import java.util.ArrayList;

/**
 *
 * @author edumo
 */
public class MainPokemon {

    static ArrayList<Pokemon> pokemons = new ArrayList<>();

    public static void main(String[] args) {
        pokemons.add(new Pokemon("Pikachu", 25, 55.5));
        pokemons.add(new Pokemon("Charizard", 36, 84.3));
        pokemons.add(new Pokemon("Bulbasaur", 16, 49.7));
        pokemons.add(new Pokemon("Squirtle", 18, 48.2));

        for (Pokemon i : pokemons) {
            //System.out.println(i);
            //System.out.println(i.getNombre() + "\t" + i.getNivel() + "\t" + i.getPoderAtaque());
            System.out.printf("%-10s %5d %10.1f%n",
                    i.getNombre(),
                    i.getNivel(),
                    i.getPoderAtaque());
        }
    }
}
