/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author Tutui
 */
public class Principal {

    public static void main(String[] args) {

        //instanciado objeto
        Data a = new Data(11, 05, 1890);

        a.setDia(07);
        a.setMes(07);
        a.setAno(1994);

        a.imprimir();
        
        a.imprimirPorExtenso();

    }

}
