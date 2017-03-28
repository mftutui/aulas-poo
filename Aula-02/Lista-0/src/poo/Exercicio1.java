//Leia três lados de um triângulo e informe se os valores realmente podem formar um triângulo
//ou não. Se formar, então indique se este é um equilétero (três lados iguais), 
//isósceles (quaisquer dois lados iguais) ou escaleno (três lados diferentes);

package poo;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) { //tem que dizer que é publico e estatico 
        // dentro dos parenteses tem os argumentos, vetor de istring   
// essas tres primeiras linhas sao importantes

        Scanner teclado = new Scanner(System.in); //scaneia o teclado

        System.out.print("Digite o valor do lado a:");
        int a = teclado.nextInt(); 

        System.out.print("Digite o valor do lado b:");
        int b = teclado.nextInt();

        System.out.print("Digite o valor do lado c:");
        int c = teclado.nextInt();

        if (((a + b) < c) || ((b + c) < a) || ((a + c) < b)) {
            System.out.println("Os valores dos lados não formam um triangulo!");
        } else {

            if (a == b && a == c) {
                System.out.println("O triângulo é equilátero");
            }

            if (a == b || b == c || a == c) {
                System.out.println("O triângulo é isóceles");

            }

            if ((a != b) && (b != c) && (c != a)) {
                System.out.println("o triângulo é escaleno");
            }
        }

    }

}