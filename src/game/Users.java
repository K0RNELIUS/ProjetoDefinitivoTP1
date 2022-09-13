/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import javax.swing.JOptionPane;
/**
 *
 * @author leobe
 */
public class Users {
    
    // Atributos
    private Dictionary dicDeUsers; // lista com 2 colunas (nick do user e pont total do user).

    // Construtor
    public Users() {
        this.dicDeUsers = new Hashtable();
    }

    // Getter
    public Dictionary getDicDeUsers() {return this.dicDeUsers;}
    public void setDicDeUsers(Dictionary d) {this.dicDeUsers = d;}

    // Metodos
    public boolean existeUser(String username) {
        if (getDicDeUsers().get(username) instanceof Integer) {
            return true;
        }
        return false;
    }
    
    public void cadastrarUser(User user) {
        if (this.existeUser(user.getUsername())) {
            JOptionPane.showMessageDialog(null, "Já existe um user com este nome. Tente outro.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            getDicDeUsers().put(user.getUsername(), user.getPontuacaoTotal());
        }
    }

    public void removerUser(String username) {
        if (this.existeUser(username)) {
            getDicDeUsers().remove(username);
        } else {
            JOptionPane.showMessageDialog(null, "User a ser removida não existe. Tente novamente.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void alterarPontuacaoUser(User user) {
        if (this.existeUser(user.getUsername())) {
            this.removerUser(user.getUsername());
            this.cadastrarUser(user);
        } else {
            JOptionPane.showMessageDialog(null, "User a ser alterado não existe. Tente novamente.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public ArrayList pesquisaUser(String username) {
        ArrayList retorno = new ArrayList();
        if (this.existeUser(username)) {
            retorno.add(true);
            retorno.add(getDicDeUsers().get(username));           
        } else {
            retorno.add(false);
        }
        return retorno;
    } 
}
