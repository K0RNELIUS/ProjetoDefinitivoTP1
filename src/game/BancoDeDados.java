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
public class BancoDeDados {
      
    public static List[] geraListas(String p1, String p2, String p3) throws IOException {       
        List[] tempArray = {Files.readAllLines(Paths.get(p1)), Files.readAllLines(Paths.get(p2)), Files.readAllLines(Paths.get(p3))};
        return tempArray; 
    }
}
