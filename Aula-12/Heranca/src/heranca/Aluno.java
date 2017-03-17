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
public class Aluno extends Pessoa {

    private String curso;
    private String anoIngresso;

    public Aluno(String curso, String anoIngresso, String nome, String matricula, String nascimento) {
        super(nome, matricula, nascimento);
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Curso: " + curso);
        System.out.println("Ano de ingresso: " + anoIngresso);
        System.out.println();
    }

}
