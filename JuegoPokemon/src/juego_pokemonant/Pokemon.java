/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_pokemonant;

/**
 *
 * @author MadellineAraya
 */
public class Pokemon {
     private String nombre;
    private int vida;
    private String tipo;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
     
    public Pokemon(String nombre, int vida, String tipo, int ataque,
    int defensa, int ataqueEspecial, int defensaEspecial) {
        
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
    }

    public Pokemon() {
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    @Override
    public String toString() {
        return "Pokemon " + " Nombre: " + nombre + ", Vida: " + vida + ", Tipo: " + tipo + ", Ataque: " + ataque + ", Defensa: " + defensa + ", AtaqueEspecial: " + ataqueEspecial + ", defensaEspecial: " + defensaEspecial + "\n";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }
}
