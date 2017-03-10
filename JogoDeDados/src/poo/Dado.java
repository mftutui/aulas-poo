/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Random;

/**
 *
 * @author Tutui
 */
public class Dado {

    // 
    private int dado;
    private int[] faces = new int[5];

    public Dado() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int jogar() {
        Random r = new Random();
        int i = r.nextInt(6);
        int j = i++;

        faces[j]++;

        return this.dado;
    }

    public void imprimirEstatisticas() {

        int indice = 0; // arrumar isso

        System.out.println("A face 1 foi sorteada:" + faces[0] + "vezes.");
        System.out.println("A face 2 foi sorteada:" + faces[1] + "vezes.");
        System.out.println("A face 3 foi sorteada:" + faces[2] + "vezes.");
        System.out.println("A face 4 foi sorteada:" + faces[3] + "vezes.");
        System.out.println("A face 5 foi sorteada:" + faces[4] + "vezes.");
        System.out.println("A face 6 foi sorteada:" + faces[5] + "vezes.");
    }

    public void zerar() {
        for (int i = 0; i < 5; i++) {
            faces[i] = 0;
        }
    }
}
