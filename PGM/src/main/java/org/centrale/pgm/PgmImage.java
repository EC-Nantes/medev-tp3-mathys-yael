/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.pgm;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author dytri
 */
public class PgmImage {
    String comment;
    int h;
    int l;
    int[][] pixels;

    public PgmImage(String comment, int h, int l) {
        this.comment = comment;
        this.h = h;
        this.l = l;
        this.pixels = new int[h][l];
    }
    
    public void save(String chemin){
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(chemin))) {
            writer.write("P2");
            writer.newLine();
            writer.write("#");
            writer.newLine();
            writer.write(l + " " + h);
            writer.newLine();
            
            System.out.println("Fichier créé avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du fichier : " + e.getMessage());
        }
    }
    }
    
}
