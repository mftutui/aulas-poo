package poo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * http://docente.ifsc.edu.br/mello
 */
public class Arqueiro extends Personagem {
    
    int z =3;

   public Arqueiro(JPanel p, String img, int x, int y) {
     super (p, img, x, y);
   }

   /**
    * Desenhando o Arqueiro, nas coordenadas X e Y, com a imagem 'icone'
    * no JPanel 'pai'
    * @param g objeto do JPanel que será usado para desenhar o Arqueiro
    */
   public void desenhar(Graphics g) {
       super.desenhar(g);
   }

   /**
    * Atualiza as coordenadas X e Y do personagem
    * 0 para cima
    * 1 para baixo
    * 2 para esquerda
    * 3 para direita
    * @param direcao inteiro que indica a direcao a ir.
    */
   public void mover(int direcao) {
      switch (direcao) {
         case 0: // subir
            this.posY -= 5;
            break;
         case 1: // descer
            this.posY += 5;
            break;
         case 2: // esquerda
            this.posX -= 5;
            break;
         case 3: // direita
            this.posX += 5;
            break;
      }
      //Não deixa a imagem ser desenhada fora dos limites do JPanel pai
      if (this.posX > this.pai.getWidth() - this.largura) {
         this.posX = this.pai.getWidth() - this.largura;
      } else if (this.posX < 0) {
         this.posX = 0;
      }
      //Não deixa a imagem ser desenhada fora dos limites do JPanel pai
      if (this.posY > this.pai.getHeight() - this.altura) {
         this.posY = this.pai.getHeight() - this.altura;
      } else if (this.posY < 0) {
         this.posY = 0;
      }
   }
   
    /**
     * Método para atacar, implementado em Personagem.
     */
   public void atacar() {
      super.atacar();
   }

   /**
    * Método auxiliar para carregar uma imagem do disco
    * @param imagem Caminho da imagem
    * @return Retorna um objeto Image
    */
   public Image carregarImagem(String imagem) {
      ImageIcon iicon = new ImageIcon(this.getClass().getResource("../imagens/" + imagem + ".png"));
      return iicon.getImage();
   }
}
