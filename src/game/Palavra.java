/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author leobe
 */
public class Palavra {
    // Atributos
    private ArrayList<String> listaDePalavras;
    private ArrayList<String> listaDeDicas;
    private ArrayList<String> listaDeDificuldades;  

    // Construtores
    public Palavra(String path1, String path2, String path3) throws IOException {
        List[] listasArray = BancoDeDados.geraListas(path1, path2, path3);
        this.listaDePalavras = (ArrayList) listasArray[0];
        this.listaDeDicas = (ArrayList) listasArray[1];
        this.listaDeDificuldades = (ArrayList) listasArray[2];
    }

    // Getters e Setters
    public ArrayList getListaDePalavras() {return this.listaDePalavras;}
    private void setListaDePalavras(ArrayList p) {this.listaDePalavras = p;}
    public ArrayList getListaDeDicas() {return this.listaDeDicas;}
    private void setListaDeDicas(ArrayList dic) {this.listaDeDicas = dic;}
    public ArrayList getListaDeDificuldades() {return this.listaDeDificuldades;}
    private void setListaDeDificuldades(ArrayList dif) {this.listaDeDificuldades = dif;}
    
    // Metodos
    public boolean pesquisaPalavra(String palavra) {
        return this.getListaDePalavras().contains(palavra);
    }

    public void cadastrarPalavra(String palavra, String dificuldade, String dica) {
        if (this.pesquisaPalavra(palavra)) {
            JOptionPane.showMessageDialog(null, "A palavra jé existe. Tente cadastrar uma nova.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            getListaDePalavras().add(palavra);
            getListaDeDificuldades().add(dificuldade);
            getListaDeDicas().add(dica);
        }
    }

    public void removerPalavra(String palavra) {
        if (!this.pesquisaPalavra(palavra)) {
            JOptionPane.showMessageDialog(null, "A palavra não existe. Tente remover outra palavra.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int indexPalavra = getListaDePalavras().indexOf(palavra);
            getListaDePalavras().remove(indexPalavra);
            getListaDeDificuldades().remove(indexPalavra);
            getListaDeDicas().remove(indexPalavra);
        }
    }

    public ArrayList<String> selecionarPalavraAleatoria(String dificuldade) {
        Random random = new Random();
        while (true) {
            int int_random = random.nextInt(getListaDeDificuldades().size());
            if (getListaDeDificuldades().get(int_random).equals(dificuldade)) {
                ArrayList<String> retorno = new ArrayList<>();
                retorno.add((String) getListaDePalavras().get(int_random));
                retorno.add((String) getListaDeDicas().get(int_random));
                return retorno;
            }
        }
    }
}
