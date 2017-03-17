package agenda;

/**
 *Essa classe serve para representar uma Pessoa em uma agenda de contatos.
 */
public class Pessoa {
    // atributos
    private String nomeCompleto;
    private String telefone;
    private Endereco endereco;
    private String email;

    // Método construtor
    public Pessoa(String nomeCompleto, String telefone, Endereco endereco, String email) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    // Métodos
    
    /**
     * Imprime todos os dados da Pessoa.
     */
    public void imprimirDados(){
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("Tel: " + this.telefone);
        this.endereco.imprimirEndereco();
        System.out.println("E-mail: " + this.email);
        
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
