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
public class Jogador {
    
    // atributos
    private int saldo;

    // metodos
    public Jogador() {
    }

    public Jogador(int valor) {
        this.saldo = valor;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void addSaldo(int valor){
        this.saldo  = this.saldo + valor;
    }
    
    public void remSaldo(int valor){
        this.saldo = this.saldo - valor;
    }
    
}
