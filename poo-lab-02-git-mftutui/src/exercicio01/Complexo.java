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
public class Complexo {
    
    // atributos 
    private double real; 
    private double imaginario;
    
    // metodos
    
    //construtor para iniciar todos os metodos
    public Complexo(double a, double b){
        real = a;
        imaginario = b;
    }
    
    /**
     * Soma de numeros complexos
     * @param aux 
     */
    public void soma(Complexo aux){
        real = real + aux.real;
        imaginario = imaginario + aux.imaginario;
    }
    
    /**
     * Subtração de numeros complexos
     * @param aux 
     */
    public void subtrai(Complexo aux){
        real = real - aux.real;
        imaginario = imaginario - aux.imaginario;
    }
    
    /**
     * Imprime o numero complexo
     */
    public void imprimir(){
        System.out.println(real + "," + imaginario);
    }
}
