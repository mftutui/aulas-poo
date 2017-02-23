//Monte e exiba uma matriz identidade 10 x 10, sabendo que em uma matriz identidade os elementos
//da diagonal principal são 1 e os demais elementos são 0.
package poo;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) { //tem que dizer que é publico e estatico 
        // dentro dos parenteses tem os argumentos, vetor de istring   
// essas tres primeiras linhas sao importantes
        int[][] identidade = new int[10][10];
        int linha = 0, col = 0;
        
        for (linha = 0; linha < identidade.length; linha++) {
            for (col = 0; col < identidade[linha].length; col++) {
                if (linha == col) {
                    identidade[linha][col] = 1;
                    //System.out.print(identidade[linha][col]);
                } else {
                    identidade[linha][col] = 0;
                    //System.out.print(identidade[linha][col]);
                    if (identidade [linha][col] == 0){
                    }
                }
            }
        }
        for (linha = 0; linha < 10; linha ++) {
            for (col = 0; col < 10; col ++) {
                System.out.print(identidade[linha][col]+"\t");
            }
            System.out.println();
        }
    }
}