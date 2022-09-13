/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.util.ArrayList;
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
    private ArrayList<Jogo> jogos;

    // Construtor
    public User(String u) {
        this.username = u;
        this.jogos = new ArrayList<>();
        setPontuacaofacil(0);
        setPontuacaomedia(0);
        setPontuacaodificil(0);
        setPontuacaoTotal(0);
    }

    // Getters e Setters:
    // Username
    public String getUsername() {return this.username;}
    private void setUsername(String u) {
        this.username = u;
    }
    //Pontuacoes
    public int getPontuacaofacil() {
        return this.pontuacaoFacil;
    }
    private void setPontuacaofacil(int f) {
        this.pontuacaoFacil = f;
    }
    public int getPontuacaomedia() {
        return this.pontuacaoMedia;
    }
    private void setPontuacaomedia(int m) {
        this.pontuacaoMedia = m;
    }
    public int getPontuacaodificil() {
        return this.pontuacaoDificil;
    }
    private void setPontuacaodificil(int d) {
        this.pontuacaoDificil = d;
    }
    public int getPontuacaoTotal() {return this.pontuacaoTotal;}
    private void setPontuacaoTotal(int t) {this.pontuacaoTotal = t;}
}
