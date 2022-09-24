/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import telas.JogoTela;

/**
 *
 * @author leobe
 */
public class Vida {
    // Atributos
    private int vida;
    private Jogo jogo;

    // Construtor
    public Vida(Jogo jogo) {
        this.vida = 7;
        this.jogo = jogo;
    }

    // Getters e Setters
    public int getVida() {return this.vida;}
    public void setVida(int v){this.vida = v;}

    // Metodos
    
}
