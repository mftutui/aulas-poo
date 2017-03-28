//Preencha um vetor com 10 números pseudo-aleatórios e imprima este vetor de forma ordenada.
//Faça uso do algoritmo de ordenação bolha.
//
//• Neste algoritmo, percorre-se o vetor até encontrar o menor valor. Quando encontrado,
//coloca-o na 1a. posição do vetor e o elemento que ali estava vai para a posição onde estava
//o menor valor. Depois procura-se pelo 2o menor elemento e coloca-o na 2a posição do vetor,
//etc.
package poo;

import java.util.Random;

public class Exercicio5 {

    public static void main(String[] args) { //tem que dizer que é publico e estatico 
        // dentro dos parenteses tem os argumentos, vetor de istring   
// essas tres primeiras linhas sao importantes

        Random gerador = new Random();
        int[] vetor = new int[10];
        int aux;
        boolean controle;

        for (int k = 0; k < 10; k++) {
            vetor[k] = gerador.nextInt(100);
        }
     
        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }
            }
            if(controle)break;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}
