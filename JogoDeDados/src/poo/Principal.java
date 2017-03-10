/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;
/**
 *
 * @author Tutui
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Jogador x = new Jogador(100);
        
        int op;
        
        while(true){
            System.out.println("---Bem vindo ao jogo de dados 3000---");
            System.out.println("1- Jogar");
            System.out.println("2- Imprimir Saldo");
            System.out.println("3- Imprimir estatísticas");
            System.out.println("4- Sair");
            
            Scanner teclado = new Scanner(System.in);
            op = teclado.nextInt();
            
            switch(op){
                case 1:
                case 2:
                    System.out.println("Você possui" + x.getSaldo() + "reais.");
                    break;
                case 3:
                    System.out.println("Estatística do dado 1:");
                    dado1.imprimirEstatisticas();
                    System.out.println("Estatística do dado 2:");
                    dado2.imprimirEstatisticas();
                    break;
                case 4: 
                    return;
            }

        }
        
        
    }
    
}
