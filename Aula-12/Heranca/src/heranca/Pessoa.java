/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Tutui
 */
public class Pessoa {

    // Atributos
    private String nome;
    private String matricula;
    private String nascimento;

    // Métodos
    public Pessoa(String nome, String matricula, String nascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.nascimento = nascimento;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Data de nascimento: " + nascimento);
        System.out.println();
    }
}
