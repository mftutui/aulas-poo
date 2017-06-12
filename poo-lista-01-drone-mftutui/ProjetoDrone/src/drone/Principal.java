package drone;

public class Principal {

    public static void main(String[] args) {

        Drone d1 = new Drone();
        Drone d2 = new Drone();
        Drone d3 = new Drone();

        d1.potRotor(); // 0,0,0,0
        d1.decolagem(); // Começa com a altitude 10
        d1.potRotor(); // 50,50,50,50
        d1.getAltitude(); // Altitude 10 
        d1.getPosicao(); // Posicao 0,0
        d1.getBateria(); //Bateria inicial 95%

        d1.setAltitude(20);
        d1.getAltitude(); // Altitude 30
        d1.getBateria(); // Bateria em 90%

        d1.moverDireita(10);
        d1.moverFrente(15);
        d1.moverTras(30);
        d1.getBateria(); // Bateria em 75%
        d1.getPosicao();

        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.setAltitude(10);
        d1.getBateria();

        Drone.getTotal();     
    }

}
