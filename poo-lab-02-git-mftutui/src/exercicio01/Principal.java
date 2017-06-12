/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Tutui
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Complexo c = new Complexo(10 , 5);
        Complexo d = new Complexo(5, 10);
        
        c.soma(d);
        c.imprimir();
        
        d.subtrai(c);
        d.imprimir();
                
        
    }
    
}
