/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author Tutui
 */
public class Principal {

    public static void main(String[] args) {
        
        Moeda a = new Moeda(30.45);
        Moeda b = new Moeda(-299.56);
        
        a.setReais(-999.99);
        a.imprimir();
        b.imprimirPorExtenso();
        
    }

}
