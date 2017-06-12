package drone;

public class Rotor {

    // Atritutos
    private int potencia;

    // Métodos
    public Rotor() {
    }

    // Método construtor
    public Rotor(int potencia) {
        this.potencia = potencia;
    }

    // Método para mostrar a potência do rotor
    public void getPotencia() {
        System.out.println(potencia);
    }

    // Método para setar uma potência
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
