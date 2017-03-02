/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Tutui
 */
public class Comutador {
    
    //atributos
    private int portasUsadas;
    private int portasLivres;
    private int numPortas;
    
    //metodos
    public void numeroPortas(int valor){
        numPortas = valor;
    }
    public void addPorta(int valor){
        portasUsadas = portasUsadas + valor;
    }
    public void remPorta(int valor){
        portasUsadas = portasUsadas - valor;
    }
    public int qtdLivres() {
        return portasLivres = (numPortas - portasUsadas);
    }
    public int qtdUsadas() {
        return portasUsadas;
    }
    public int portas() {
        return numPortas;
    }
}
