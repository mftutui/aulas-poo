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
public class Tae extends Pessoa {

    private String setor, cargo;

    public Tae(String setor, String cargo, String nome, String matricula, String nascimento) {
        super(nome, matricula, nascimento);
        this.setor = setor;
        this.cargo = cargo;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
        System.out.println();
    }
}
