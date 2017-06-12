package drone;

public final class Drone {

    // Atributos
    private int bateria, altitude;
    private int coordenadaX, coordenadaY;
    private final int ALTINICIAL = 10;
    private final int BATCHEIA = 100;

    /**
     * Variável para contar o número de Drones inicializados
     */
    private static int total = 0;

    private Rotor q1 = new Rotor();
    private Rotor q2 = new Rotor();
    private Rotor q3 = new Rotor();
    private Rotor q4 = new Rotor();

    // Métodos
    // Método construtor
    public Drone() {
            Drone.total = Drone.total + 1;
            this.bateria = BATCHEIA;
            this.coordenadaX = 0;
            this.coordenadaY = 0;
            setAltitude();
    }

    // Método construtor
//    public Drone(int coordenadaX, int coordenadaY, int altitude) {
//        this.bateria = BATCHEIA;
//        this.altitude = altitude;
//        this.coordenadaX = coordenadaX;
//        this.coordenadaY = coordenadaY;
//        q1 = new Rotor();
//        q2 = new Rotor();
//        q3 = new Rotor();
//        q4 = new Rotor();
//        Drone.total = Drone.total + 1;
//    }
    // Método para mostrar o nível da bateria
    public void getBateria() {
        System.out.println("O nível de bateria é de " + bateria + ".");
    }

    // Método para mostar a altitude do drone
    public void getAltitude() {
        System.out.println("A altitude do drone é de " + altitude + ".");
    }

    // Método para setar uma altitude para o drone
    public void setAltitude(int a) {
        if (bateria <= 10) {
            System.out.println("Nível de bateria baixo, iniciando retorno para "
                    + "o ponto de partida.");
            setPosicao();
        } else {
            this.altitude = altitude + a;
            this.bateria = this.bateria - 5;
        }
    }

    // Método para setar a altitude para 0
    public void setAltitude() {
        this.altitude = 0;
    }

    /**
     * Método responsável pra decolagem do Drone. Seta dos valores iniciais para
     * o Drone decolar
     */
    public void decolagem() {
        this.bateria = BATCHEIA;
        this.altitude = ALTINICIAL;
        this.coordenadaX = 0;
        this.coordenadaY = 0;
        q1.setPotencia(50);
        q2.setPotencia(50);
        q3.setPotencia(50);
        q4.setPotencia(50);
        this.bateria = this.bateria - 5;
        System.out.println("O Drone decolou!");
    }

    /**
     * Método que move o Drone pra frente
     *
     * @param x; valor a ser somado a X para mover o drone no plano
     */
    public void moverFrente(int x) {
        if (bateria <= 10) {
            System.out.println("Nível de bateria baixo, iniciando retorno para "
                    + "o ponto de partida.");
            setPosicao();
        } else {
            q1.setPotencia(75);
            q2.setPotencia(25);
            q3.setPotencia(25);
            q4.setPotencia(75);
            this.coordenadaX = this.coordenadaX + x;
            this.bateria = this.bateria - 5;
            System.out.println("O Drone moveu para a FRENTE.");
        }
    }

    /**
     * Método que move o Drone para trás
     *
     * @param x; valor a ser subtraído de X para mover o drone no plano
     */
    public void moverTras(int x) {
        if (bateria < 10) {
            System.out.println("Nível de bateria baixo, iniciando retorno para "
                    + "o ponto de partida.");
            setPosicao();
        } else {
            q1.setPotencia(25);
            q2.setPotencia(75);
            q3.setPotencia(75);
            q4.setPotencia(25);
            this.coordenadaX = this.coordenadaX + -x;
            this.bateria = this.bateria - 5;
            System.out.println("O Drone moveu para TRAS.");
        }
    }

    /**
     * Método que move o Drone para a direita
     *
     * @param y; valor a ser adicionado a Y para mover o drone no plano
     */
    public void moverDireita(int y) {
        if (bateria < 10) {
            System.out.println("Nível de bateria baixo, iniciando retorno para "
                    + "o ponto de partida.");
            setPosicao();
        } else {
            q1.setPotencia(25);
            q2.setPotencia(25);
            q3.setPotencia(75);
            q4.setPotencia(75);
            this.coordenadaY = this.coordenadaY + y;
            this.bateria = this.bateria - 5;
            System.out.println("O Drone moveu para a DIREITA.");
        }
    }

    /**
     * Método que move o Drone para a esquerda
     *
     * @param y; valor a ser subtraído de Y para mover o drone no plano
     */
    public void moverEsquerda(int y) {
        if (bateria < 10) {
            System.out.println("Nível de bateria baixo, iniciando retorno para "
                    + "o ponto de partida.");
            setPosicao();
        } else {
            q1.setPotencia(75);
            q2.setPotencia(75);
            q3.setPotencia(25);
            q4.setPotencia(25);
            this.coordenadaY = this.coordenadaY + -y;
            this.bateria = this.bateria - 5;
            System.out.println("O Drone moveu para a ESQUERDA.");
        }
    }

    /**
     * Método que faz o drone voltar para a "casa".
     */
    public void setPosicao() {
        this.bateria = 0;
        this.coordenadaX = 0;
        this.coordenadaY = 0;
        q1.setPotencia(0);
        q2.setPotencia(0);
        q3.setPotencia(0);
        q4.setPotencia(0);
        setAltitude();
        System.out.println("O Drone voltou para o ponto de partida!");
    }

    /**
     * Método para mostrar as posições x e y na tela.
     */
    public void getPosicao() {
        System.out.println("Posição x: " + this.coordenadaX + ".");
        System.out.println("Posição y: " + this.coordenadaY + ".");
    }

    /**
     * Método para mostrar a potência das duplas de rotores.
     */
    public void potRotor() {
        System.out.println("A potência de cada rotor é respectivamente: ");
        q1.getPotencia();
        q2.getPotencia();
        q3.getPotencia();
        q4.getPotencia();
    }

    // Método para mostrar a quantidade de Drones criada.
    public static void getTotal() {
        System.out.println("O número total de drones é de:" + total);
    }
}
