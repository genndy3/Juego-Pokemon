package juego_pokemonant;

import juego_pokemonant.Interfaz.*;

public class Juego_PokemonAnt {
    public static void main(String[] args) {
        ListaPokemon listas = new ListaPokemon();   
        listas.crearListas();
        Play abrir   = new Play();
        abrir.setVisible(true);    
        Pokedex setPokedexCPU = new Pokedex();       
        setPokedexCPU.escogerPokeCpu(listas.getListaPokemonCpu());           
       
        //Batalla batalla = new Batalla ();
        //batalla.batalla(setPokedex, setPokedexCPU);

    }
    
}
