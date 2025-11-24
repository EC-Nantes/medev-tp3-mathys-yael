/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.pgm;

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
    
    
}
