//Imprima os 15 primeiros termos da série de Fibonacci. Tal série inicia-se por 0 e 1, e então os
//números subsequentes consiste na soma dos dois números anteriores. Ex: série com 6 termos: 0,
//1, 1, 2, 3, 5;

package poo;

public class Exercicio2 {
    
     public static void main(String[] args) { //tem que dizer que é publico e estatico 
                            // dentro dos parenteses tem os argumentos, vetor de istring   
// essas tres primeiras linhas sao importantes
        
         int a = 0;
         int b = 1; 
         int c = 1;
         int aux = 0;
         
         while (aux < 15){
             System.out.println(a);
             a = b;
             b = c;
             c = a+b;
             aux ++;
         }
    }
    
}