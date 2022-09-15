/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

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
    private void setVida(int v){this.vida = v;}

    // Metodos
    public void perdeVida() {
        setVida(getVida() - 1);
        this.atualizaPersonagem();
    }

    public void zeraVida() {
        setVida(0);
        this.atualizaPersonagem();
    }

    public void atualizaPersonagem() {
        switch (vida) {
            case 7 -> {
                System.out.println("OnHangLine...");
                System.out.println("--* ");
                System.out.println("  | ");
            }
            case 6 -> {
                System.out.println("OnHangLine...");
                System.out.println("--* ");
                System.out.println("  | ");
                System.out.println("  0 ");
            }
            case 5 -> {
                System.out.println("OnHangLine...");
                System.out.println("--* ");
                System.out.println("  | ");
                System.out.println("  0 ");
                System.out.println("  | ");
            }
            case 4 -> {
                System.out.println("OnHangLine...");
                System.out.println("--* ");
                System.out.println("  | ");
                System.out.println("  0 ");
                System.out.println(" -| ");
            }
            case 3 -> {
                System.out.println("OnHangLine...");
                System.out.println("--* ");
                System.out.println("  | ");
                System.out.println("  0 ");
                System.out.println(" -|-");
            }
            case 2 -> {
                System.out.println("OnHangLine...");
                System.out.println("--* ");
                System.out.println("  | ");
                System.out.println("  0 ");
                System.out.println(" -|-");
                System.out.println("  l ");
            }
            case 1 -> {
                System.out.println("OnHangLine...");
                System.out.println("--* ");
                System.out.println("  | ");
                System.out.println("  0 ");
                System.out.println(" -|-");
                System.out.println("  ll");
            }
            case 0 -> {
                System.out.println("OnHangLine...");
                System.out.println("You Lost!");
            }
        }
    }
}
