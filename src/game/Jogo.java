/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author leobe
 */
public class Jogo {
    
    // Atributos
    private User user;
    private String palavraReal;
    private String dica;
    private char[] progresso;
    private ArrayList<Character> chutesLetras;
    private ArrayList<String> chutesPalavras;
    private Vida instVida;


    // Construtores
    public Jogo(Palavra p, String dif, User u) {
        ArrayList<String> retorno = p.selecionarPalavraAleatoria(dif);
        setPalavraReal(retorno.get(0));
        setDica(retorno.get(1));
        char[] tempProgresso = new char[getPalavraReal().length()];
        for (int i = 0; i < getPalavraReal().length(); i++) {
            tempProgresso[i] = '*';
        }
        setProgresso(tempProgresso);
        this.chutesLetras = new ArrayList<>();
        this.chutesPalavras = new ArrayList<>();
        this.user = u;
        this.instVida = new Vida();
    }

    // Getters e Setters
    public User getUser() {return this.user;}
    public void setUser(User user) {this.user = user;}
    private String getPalavraReal() {return this.palavraReal;}
    private void setPalavraReal(String r) {this.palavraReal = r;}
    private String getDica() {return this.dica;}
    public void setDica(String dica) {this.dica = dica;}
    public char[] getProgresso() {return this.progresso;}
    private void setProgresso(char[] p) {this.progresso = p;}
    public ArrayList<Character> getChutesLetras() {return this.chutesLetras;}
    private void setChutesLetras(ArrayList<Character> cl) {this.chutesLetras = cl;}
    public ArrayList<String> getChutesPalavras() {return this.chutesPalavras;}
    private void setChutesPalavras(ArrayList<String> cp) {this.chutesPalavras = cp;}
    public Vida getInstVida() {return this.instVida;}
    private void setInstVida(Vida v) {this.instVida = v;}

    // Metodos
    public void chutarLetra(char letra) {
        if (getChutesLetras().contains(letra)) {
            JOptionPane.showMessageDialog(null, "O chute realizo já foi feito. Tente outro", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            getChutesLetras().add(letra);
            boolean achou = false;
            for (int i = 0; i < getPalavraReal().length(); i++) {
                if (letra == getPalavraReal().charAt(i)) {
                    progresso[i] = getPalavraReal().charAt(i);
                    achou = true;
                }
            }
            if (achou) {
                boolean acertou = true;
                for (int i = 0; i < getPalavraReal().length(); i++) {
                    if (getProgresso()[i] != getPalavraReal().charAt(i)) {
                        acertou = false;
                    }
                }
                if (acertou) {
                    JOptionPane.showMessageDialog(null, "Venceu!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Acertou!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Errou!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                getInstVida().perdeVida();
            }
        }
    }

    public void chutarPalavra(String palavra) {
        if (getChutesPalavras().contains(palavra)) {
            JOptionPane.showMessageDialog(null, "O chute realizo já foi feito. Tente outro", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            getChutesPalavras().add(palavra);
            if (palavra.equals(this.getPalavraReal())) {
                JOptionPane.showMessageDialog(null, "Venceu!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            } else {
                this.chutesPalavras.add(palavra);
                getInstVida().perdeVida();
               JOptionPane.showMessageDialog(null, "Errou!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void dica() {
        System.out.println(getDica());
    }

    public void desistir() {
        getInstVida().zeraVida();
    }
}
