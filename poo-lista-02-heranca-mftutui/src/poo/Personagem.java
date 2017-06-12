/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author aluno
 */
public abstract class Personagem {

    protected JPanel pai;  // referência ao JPanel onde será desenhado o Aldeao
    protected Image icone; // imagem do Aldeao
    protected String imagemNome; // nome da imagem do Aldeao
    protected int largura; // largura da imagem
    protected int altura;  // altura da imagem
    protected int posX;    // posição X no JPanel onde a imagem será desenhada
    protected int posY;    // posição Y no JPanel onde a imagem será desenhada
    protected boolean atacando; // indica se está atacando ou não

    public Personagem(JPanel p, String img, int x, int y) {

        this.imagemNome = img;
        this.icone = this.carregarImagem(this.imagemNome);
        this.largura = this.icone.getWidth(null);
        this.altura = this.icone.getHeight(null);

        this.pai = p;
        this.posX = x;
        this.posY = y;
        this.atacando = false;
    }

    public void desenhar(Graphics g) {
        // verificando qual imagem carregar
        if (atacando == true) {
            this.icone = this.carregarImagem(this.imagemNome + "2");
        } else {
            this.icone = this.carregarImagem(this.imagemNome);
        }
        // desenhando de fato a imagem no pai
        g.drawImage(this.icone, this.posX, this.posY, this.pai);
    }

    public abstract void mover(int direcao); //Só declarando pq a implementacao de mover é dif em cada personagem

    public void atacar() {
        this.atacando = !this.atacando;
    }

    protected abstract Image carregarImagem(String imagem);
}
