//Leia um número do teclado e informe se este é um número perfeito. Número perfeito ó um
//número inteiro cuja soma de todos os seus divisores positivos, excluindo ele próprio, é igual ao
//próprio número;

package poo;

import java.util.Scanner;


public class Exercicio3 {
    
     public static void main(String[] args) { //tem que dizer que é publico e estatico 
                            // dentro dos parenteses tem os argumentos, vetor de istring   
// essas tres primeiras linhas sao importantes

         Scanner teclado = new Scanner(System.in);
         int x = teclado.nextInt();
         
         int metade = x/2, y = 1, soma = 0;
         
         while(y <= metade){
             if (x%y==0){
                 soma += y;
             }
             y++;
         }
        
         if (soma == x) System.out.println("O numero "+x+" é perfeito.");
         else System.out.println("O número "+x+" não é perfeito.");
         
    }
    
}
