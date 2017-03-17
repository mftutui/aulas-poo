package poo;

import agenda.Endereco;
import agenda.Pessoa;

/**
 * Essa é a classe principal do meu projeto. Usarei ela para criar instancias
 * das demais classes.
 */
public class Principal {

    public static void main(String[] args) {

        Endereco e = new Endereco("rua", "666", "estreito", "floripa", "sc", "88070-780", "BR");

        Pessoa p = new Pessoa("Maria", "999999999", e, "maria@tutui");
        
        p.imprimirDados();
   
    }

}
