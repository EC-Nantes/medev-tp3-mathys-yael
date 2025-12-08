/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.pgm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dytri
 */
public class PGMImage {
    private String comment;
    private int h;
    private int l;
    private int[][] pixels;

    public PGMImage(String comment, int h, int l) {
        this.comment = comment;
        this.h = h;
        this.l = l;
        this.pixels = new int[h][l];
    }

    public String getComment() {
        return comment;
    }

    public int getH() {
        return h;
    }

    public int getL() {
        return l;
    }

    public int[][] getPixels() {
        return pixels;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setPixels(int[][] pixels) {
        this.pixels = pixels;
    }
    
    
    
    public void save(String chemin){
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(chemin))) {
            writer.write("P2");
            writer.newLine();
            writer.write(comment);
            writer.newLine();
            writer.write(l + " " + h);
            writer.newLine();
            writer.write(255);
            writer.newLine();
            int nb_carac = 0;
            for(int i=0;i<h;i++){
                for(int j=0;j<l;j++){
                    writer.write(pixels[i][j] + " ");
                    nb_carac += 4;
                    if(nb_carac > 66){
                        writer.newLine();
                        nb_carac = 0;
                    }
                }
            }
            
            System.out.println("Fichier créé avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du fichier : " + e.getMessage());
        }
    }
}
    

