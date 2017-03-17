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
public class Professor extends Pessoa {

    private String titulacao, formacao;

    public Professor(String titulacao, String formacao, String nome, String matricula, String nascimento) {
        super(nome, matricula, nascimento);
        this.titulacao = titulacao;
        this.formacao = formacao;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Titulo: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println();
    }

}
