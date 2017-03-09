/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Dado {
    
    // atributos
    private int dado;
    
    private int[] faces = new int[6];
  
    // metodos
    
    // metodo contrutos padrao
    public Dado() {
    }
    
    // metodo construtor
    public Dado(int dado) {
        this.dado = dado;
    }

    // metodos getters e setters
    public int getDado1() {
        return dado;
    }
    
    public int jogar(){
        Random r = new Random();
        int i = r.nextInt(6);
     
        this.dado=i++;
        
        faces[i]++;
        
        return this.dado;
        
    }
    
    public void imprimirEstatisticas(){

        System.out.println("A face 1 foi sorteada:" + + "vezes." );
        System.out.println("A face 2 foi sorteada:" + + "vezes." );
        System.out.println("A face 3 foi sorteada:" + + "vezes." );
        System.out.println("A face 4 foi sorteada:" + + "vezes." );
        System.out.println("A face 5 foi sorteada:" + + "vezes." );
        System.out.println("A face 6 foi sorteada:" + + "vezes." );
    }
    
    public void zerar(){
        
    }
}
