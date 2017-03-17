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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p = new Pessoa("Maria", "1234", "07/07/1994");
        Aluno a = new Aluno("Eng Tele", "2011", "Paulo", "4321", "12/12/12");
        Tae t = new Tae("Administracao", "Administrador", "Ana", "5555", "11/11/1990");
        Professor pf = new Professor("Doutor", "Engenharia Elétrica", "Joao", "9090", "05/05/1980");
        
        p.imprimirDados();
        a.imprimirDados();
        t.imprimirDados();
        pf.imprimirDados();
        
    }
    
}
