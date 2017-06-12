/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadados;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Tutui
 */
public class Controle extends Thread {

    private Dado dado1;
    private Dado dado2;
    private Principal p;

    public Controle(Dado dado1, Dado dado2, Principal p) {
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.p = p;
    }

    public void run() {
        dado1.start();
        dado2.start();

        try {
            dado1.join();
            dado2.join();
            
            p.verificaSoma(dado1.getValorSorteado(), dado2.getValorSorteado());
            //p.verificaSoma(Integer.parseInt(dado1.getValorSorteado()),Integer.parseInt(dado2.getValorSorteado()));
    } 
     catch (InterruptedException ex) {

        }
    }

}
