// Richard Rivaldo 13519185

import java.io.*;

// Buat kelas NormalPokemon yang merupakan turunan dari kelas Pokemon
public class NormalPokemon extends Pokemon{
    public NormalPokemon(){
        super();
        System.out.println("ctor1 NormalPokemon");
    }
    public NormalPokemon(String name){
        super(name);
        System.out.println("ctor2 NormalPokemon");
    }
    public void checkElement(){
        System.out.println("No element for NormalPokemon");
    }
    @Override
    public void displayClass(){
        System.out.println("Sub Class NormalPokemon");
    }
}

// Buat constructor tanpa parameter, mencetak "ctor1 NormalPokemon" ke layar

// Buat constructor dengan parameter String name, mencetak "ctor2 NormalPokemon" ke layar

// Buat prosedur checkElement yang mencetak "No element for NormalPokemon" ke layar

// Override prosedur displayClass yang mencetak "Sub Class NormalPokemon"