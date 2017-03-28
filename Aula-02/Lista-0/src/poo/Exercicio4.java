//Simule um jogo de azar que apresente algumas dicas ao jogador. O programa deverá sortear
//um número de 1 a 100 e deverá questionar o jogador para fornecer um número. O programa
//só deverá ser encerrado se o jogador acertar o número sorteado. Porém, o programa também
//deverá dar dicas ao jogador, indicando a quantidade de vezes que ele já optou por um número.
//
//• Exemplo: O número sorteado foi 10. O jogador escolhe 5 e o computador exibe “tente
//outra vez”; o jogador escolhe 20 e o computador exibe “tente outra vez”; o jogador escolhe
//5 novamente (ele esqueceu que já tinha tentado com 5) e o computador exibe “você já
//escolheu 2 vezes o número 5, tente outro número”.
package poo;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) { //tem que dizer que é publico e estatico 
        // dentro dos parenteses tem os argumentos, vetor de istring   
// essas tres primeiras linhas sao importantes

        int[] possibilidades = new int[101];

        Random r = new Random();
        int sorteado = r.nextInt(101);
        int novo = sorteado + 1;

        System.out.println("O número sorteado foi o " + novo + ".");

        Scanner teclado = new Scanner(System.in); //scaneia o teclado

        System.out.println();
        System.out.println("Digite um numero de 1 a 100:");

        int coletado = teclado.nextInt();

        while (coletado != novo) {
            System.out.println("Número errado... ");

            if (possibilidades[coletado] == 0) {
                possibilidades[coletado] = coletado; //colocando o numero que ele tentou na posicao do vetor
            } else {
                System.out.println("Você já tentou o número " + coletado);
            }
            System.out.println();
            System.out.println("Digite um numero de 1 a 100:");
            coletado = teclado.nextInt();

        }
        System.out.print("Você acertou, parabéns!");
    }
}