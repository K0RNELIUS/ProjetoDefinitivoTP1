/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import javax.swing.JOptionPane;
import telas.JogoConfirmationTela;
import telas.JogoTela;

/**
 *
 * @author leobe
 */
public class Vida {
    // Atributos
    private int vida;
    private JogoTela tela;

    // Construtor
    public Vida() {
        this.vida = 7;
    }
    
    public Vida(JogoTela t) {
        this.vida = 7;
        this.tela = t;
    }

    // Getters e Setters
    public int getVida() {return this.vida;}
    private void setVida(int v){this.vida = v;}

    // Metodos
    
    public void atualizaPersonagem() {
        switch (this.getVida()) {
            case 7 -> {
                tela.alteraLblPersonagem("/imagens/HangMan1-removebg-preview.png");
                break;
            }
            case 6 -> {
                tela.alteraLblPersonagem("/imagens/HangMan2-removebg-preview.png");
                break;
            }
            case 5 -> {
                tela.alteraLblPersonagem("/imagens/HangMan3-removebg-preview.png");
                break;
            }
            case 4 -> {
                tela.alteraLblPersonagem("/imagens/HangMan4-removebg-preview.png");
                break;
            }
            case 3 -> {
                tela.alteraLblPersonagem("/imagens/HangMan5-removebg-preview.png");
                break;
            }
            case 2 -> {
                tela.alteraLblPersonagem("/imagens/HangMan6-removebg-preview.png");
                break;
            }
            case 1 -> {
                tela.alteraLblPersonagem("/imagens/HangMan7-removebg-preview.png");
                break;
            }
            case 0 -> {
                JOptionPane.showMessageDialog(null, "Game Over!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                new JogoConfirmationTela().setVisible(true);
                break;
            }
        }
    }
    
    public void perdeVida() {
        this.setVida(this.getVida() - 1);
        this.atualizaPersonagem();
    }

    public void zeraVida() {
        this.setVida(0);
        this.atualizaPersonagem();
    }
}
