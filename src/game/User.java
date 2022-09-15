/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *
 * @author leobe
 */
public class User {
    // Atributos
    private String username;
    private int pontuacaoFacil;
    private int pontuacaoMedia;
    private int pontuacaoDificil;

    private int pontuacaoTotal;
    private Jogo jogo;

    // Construtor
    public User(String u) {
        setPontuacaoFacil(0);
        setPontuacaoMedia(0);
        setPontuacaoDificil(0);
        setPontuacaoTotal(0);
    }

    // Getters e Setters:
    // Username
    public String getUsername() {return this.username;}
    private void setUsername(String u) {
        this.username = u;
    }
    //Pontuacoes
    public int getPontuacaoFacil() {
        return this.pontuacaoFacil;
    }
    private void setPontuacaoFacil(int f) {
        this.pontuacaoFacil = f;
    }
    public int getPontuacaoMedia() {
        return this.pontuacaoMedia;
    }
    private void setPontuacaoMedia(int m) {
        this.pontuacaoMedia = m;
    }
    public int getPontuacaoDificil() {
        return this.pontuacaoDificil;
    }
    private void setPontuacaoDificil(int d) {
        this.pontuacaoDificil = d;
    }
    public int getPontuacaoTotal() {return this.pontuacaoTotal;}
    private void setPontuacaoTotal(int t) {this.pontuacaoTotal = t;}
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    // Metodos
    public void acrescentePontuacao(String dif) {
        if (dif.equals("Facil")) {
            this.setPontuacaoFacil(this.getPontuacaoFacil() + 1);
        } else if (this.equals("Medio")) {
            this.setPontuacaoMedia(this.getPontuacaoMedia() + 1);
                  
        } else if (this.equals("Dificil")) {
            this.setPontuacaoDificil(this.getPontuacaoDificil() + 1);               
        }
        this.setPontuacaoTotal(this.getPontuacaoTotal() + 1);
    }
}
