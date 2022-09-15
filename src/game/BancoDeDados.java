package game;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author leobe
 */
// Classe que acessa arquivos e forma listas que serao necessarias no resto do projeto
public class BancoDeDados {
      
    // Metodo que constroi listas das palavras para ser utilizado na classe palavra
    /*public static List[] geraListasPalavras(String path1, String path2, String path3) { 
        List[] listaVazia = new List[1];
        try {
            List[] tempArray = {Files.readAllLines(Paths.get(path1)), Files.readAllLines(Paths.get(path2)), Files.readAllLines(Paths.get(path3))}; 
            return tempArray;
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            return listaVazia;
        }
    }*/
    
    // Metodo que constroi listas dos users para ser utilizado na classe palavra
    /*public static List[] geraListasUsers(String path1, String path2, String path3, String path4, String path5) { 
        List[] listaVazia = new List[1];
        try {
            List[] tempArray = {Files.readAllLines(Paths.get(path1)), Files.readAllLines(Paths.get(path2)), Files.readAllLines(Paths.get(path3)), Files.readAllLines(Paths.get(path4)), Files.readAllLines(Paths.get(path5))}; 
            return tempArray;
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            return listaVazia;
        }*/
}