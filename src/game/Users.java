/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author leobe
 */
public class Users {
    
    // Atributos
    // Listas que formam tabela que reunem infos associados ao user pelo indice
    private ArrayList<String> listaDeUsernames;
    private ArrayList<Integer> listaDePontosFacil;
    private ArrayList<Integer> listaDePontosMedio;
    private ArrayList<Integer> listaDePontosDificil;
    private ArrayList<Integer> listaDePontosTotal;
    private ArrayList<User> listaDeUsers;
    
    public Users() {
        this.listaDeUsernames = new ArrayList<String>();
        this.listaDePontosFacil = new ArrayList<Integer>();
        this.listaDePontosMedio = new ArrayList<Integer>();
        this.listaDePontosDificil = new ArrayList<Integer>();
        this.listaDePontosTotal = new ArrayList<Integer>();
        this.listaDeUsers = new ArrayList<User>();
    }

    // Getters e Setters
    public ArrayList<String> getListaDeUsernames() {
        return this.listaDeUsernames;
    }

    private void setListaDeUsernames(ArrayList<String> listaDeUsernames) {
        this.listaDeUsernames = listaDeUsernames;
    }

    public ArrayList<Integer> getListaDePontosFacil() {
        return this.listaDePontosFacil;
    }

    private void setListaDePontosFacil(ArrayList<Integer> listaDePontosFacil) {
        this.listaDePontosFacil = listaDePontosFacil;
    }

    public ArrayList<Integer> getListaDePontosMedio() {
        return this.listaDePontosMedio;
    }

    private void setListaDePontosMedio(ArrayList<Integer> listaDePontosMedio) {
        this.listaDePontosMedio = listaDePontosMedio;
    }

    public ArrayList<Integer> getListaDePontosDificil() {
        return this.listaDePontosDificil;
    }

    private void setListaDePontosDificil(ArrayList<Integer> listaDePontosDificil) {
        this.listaDePontosDificil = listaDePontosDificil;
    }

    public ArrayList<Integer> getListaDePontosTotal() {
        return this.listaDePontosTotal;
    }

    private void setListaDePontosTotal(ArrayList<Integer> listaDePontosTotal) {
        this.listaDePontosTotal = listaDePontosTotal;
    }
    
    public ArrayList<User> getListaDeUsers() {
        return listaDeUsers;
    }

    private void setListaDeUsers(ArrayList<User> listaDeUsers) {
        this.listaDeUsers = listaDeUsers;
    }

    // Metodos
    public boolean existeUsername(String username) {
        return getListaDeUsernames().contains(username);
    }
    
    public boolean cadastrarUser(String username) {
        if (this.existeUsername(username)) {
            JOptionPane.showMessageDialog(null, "Já existe um user com este nome. Tente outro.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            getListaDeUsernames().add(username);
            getListaDePontosFacil().add(0);
            getListaDePontosMedio().add(0);
            getListaDePontosDificil().add(0);
            getListaDePontosTotal().add(0);
            JOptionPane.showMessageDialog(null, "Usuário cadastrada com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            User userTemp = new User(username);
            this.getListaDeUsers().add(userTemp);
            return true;
        }
    }

    public boolean removerUser(String username) {
        if (this.existeUsername(username)) {
            int indexUsername = getListaDeUsernames().indexOf(username);
            getListaDeUsernames().remove(indexUsername);
            getListaDePontosFacil().remove(indexUsername);
            getListaDePontosMedio().remove(indexUsername);
            getListaDePontosDificil().remove(indexUsername);
            getListaDePontosTotal().remove(indexUsername);
            JOptionPane.showMessageDialog(null, "User apagado com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "User a ser alterado não existe. Tente novamente.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public void alterarUsername(String usernameNovo, String usernameAntigo) {
        if (this.existeUsername(usernameAntigo)) {
            int indexUsername = getListaDeUsernames().indexOf(usernameAntigo);
            getListaDeUsernames().set(indexUsername, usernameNovo);
        }
    }
    
    public void acrescentaPontuacao(String username, String dif) {
        if (this.existeUsername(username)) {
            int index = this.getListaDeUsernames().indexOf(username);
            if (dif.equals("Facil")) {
                this.getListaDePontosFacil().set(index, this.getListaDePontosFacil().get(index) + 1);
            } else if (dif.equals("Medio")) {
                this.getListaDePontosMedio().set(index, this.getListaDePontosMedio().get(index) + 1);
            } else if (dif.equals("Dificil")) {
                this.getListaDePontosDificil().set(index, this.getListaDePontosDificil().get(index) + 1);        
            } 
            this.getListaDePontosTotal().set(index, this.getListaDePontosTotal().get(index) + 1);
        }
    }

    
}
