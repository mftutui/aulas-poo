/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Tutui e Paulo Sell
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Comutador c;
        c = new Comutador();
        int valor;

        Scanner teclado = new Scanner(System.in); //scaneia o teclado

        System.out.println("Digite a quantidade de portas que o seu switch possui:");

        valor = teclado.nextInt();

        c.numeroPortas(valor);

        while (true) {

            System.out.println("--Bem vindo ao gerenciador do seu switch--");
            System.out.println("1 - Quantidade de portas");
            System.out.println("2 - Quantidade de portas livres");
            System.out.println("3 - Quantidade de portas ocupadas");
            System.out.println("4 - Uso de portas (acrescentar)");
            System.out.println("5 - Uso de portas (decrementar)");
            System.out.println("6 - Sair");

            int op;
            int aux;

            op = teclado.nextInt();

            switch (op) {
                case 1:
                    aux = c.portas();
                    System.out.println(aux);
                    break;
                case 2:
                    aux = c.qtdLivres();
                    System.out.println(aux);
                    break;
                case 3:
                    aux = c.qtdUsadas();
                    System.out.println(aux);
                    break;
                case 4:
                    aux = teclado.nextInt();
                    c.addPorta(aux);
                    break;
                case 5:
                    aux = teclado.nextInt();
                    c.remPorta(aux);
                    break;
                case 6:
                    return;
                default:
                    break;

            }

        }

    }

}
