/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import telas.FinalTela;
import telas.JogoConfirmationTela;
import telas.JogoTela;
import telas.PrincipalTela;

/**
 *
 * @author leobe
 */
public class Jogo {

    // Atributos
    private String palavraReal; // Palavra que se busca acertar no jogo
    private String dica; // Dica da palavra que se busca acertar
    private char[] progresso; // Segura progresso do jogador na palavra
    private ArrayList<Character> chutesLetras; // armazena chutes de letras feitos
    private ArrayList<String> chutesPalavras; // armazena chutes de palavras feitos
    private String dificuldade;
    
    // Objetos associados
    private User user; // Jogo esta associado um pra um com user, por isso este atributo
    private Vida instVida; // Associacao de jogo com vida, tb de um pra um.
    private JogoTela tela;

    // Construtores
    // Inicializa Jogo
    
     public Jogo(String dif, User u, Palavra palavras, JogoTela tela) {
        ArrayList<String> retorno = palavras.selecionarPalavraAleatoria(dif);
        setPalavraReal(retorno.get(0));
        setDica(retorno.get(1));
        char[] tempProgresso = new char[getPalavraReal().length()];
        for (int i = 0; i < getPalavraReal().length(); i++) {
            tempProgresso[i] = '*';
        }
        setProgresso(tempProgresso);
        this.chutesLetras = new ArrayList<>();
        this.chutesPalavras = new ArrayList<>();
        this.dificuldade = dif;
        
        this.user = u;
        this.tela = tela;
        this.instVida = new Vida(this.tela);
       
    }

    // Getters e Setters
    public User getUser() {return this.user;}
    public void setUser(User user) {this.user = user;}
    public  String getPalavraReal() {return this.palavraReal;}
    private void setPalavraReal(String r) {this.palavraReal = r;}
    public String getDica() {return this.dica;}
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
    
    // Este metodo verifica se a letra ja foi chutada e atualiza progresse se houver a letra ou vida se n.
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
                    this.tela.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Venceu!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    this.tela.atualizaPont(this.user.getUsername(), this.dificuldade);
                    this.tela.setVisible(false);
                    new FinalTela().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Acertou!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    this.tela.alteraLblProgresso(String.valueOf(this.getProgresso()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Errou!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                this.getInstVida().perdeVida();
            }
        }
    }

    // Mesma ideia do chutarLetra, mas com palavra
    public void chutarPalavra(String palavra) {
        if (getChutesPalavras().contains(palavra)) {
            JOptionPane.showMessageDialog(null, "O chute realizo já foi feito. Tente outro", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            getChutesPalavras().add(palavra);
            if (palavra.equals(this.getPalavraReal())) {
                this.tela.setVisible(false);
                JOptionPane.showMessageDialog(null, "Venceu!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                this.tela.atualizaPont(this.user.getUsername(), this.dificuldade);
                this.tela.setVisible(false);
                new FinalTela().setVisible(true);
            } else {
                this.chutesPalavras.add(palavra);
                JOptionPane.showMessageDialog(null, "Errou!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                this.getInstVida().perdeVida();
            }
        }
    }

    // Metodo que tem como intuito apresentar a dica na interface
    // Uma vez clicado este botao a dica deve se tornar indisponivel, pois so tem uma por jogo
    // Falta atualizar este metodo para integra-lo
    public void dica() {
        this.tela.alteraLblDica(this.getDica());
    }
    
    // Opcao de desistir do jogo. Faz com que ao clicar no botao o user perca a partida imediatamente
    public void desistir() {
        this.getInstVida().zeraVida();
    }
}
