/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author Tutui
 */
public class Moeda {

    //atributos
    private double reais;

    //metodos
    //contrutor
    public Moeda() {
    }

    //construtor para iniciar todo os metodos
    public Moeda(double reais) {
        if (reais > 1000 || reais < -1000) {
            System.out.println("Setar este valor nao é permitido!");
        } else {
            this.reais = reais;
        }
    }

    public double getReais() {
        return reais;
    }

    public void setReais(double reais) {
        if (reais > 1000 || reais < -1000) {
            System.out.println("Setar este valor nao é permitido!");
        } else {
            this.reais = reais;
        }
    }

    /**
     * Método para imprimir o valor
     */
    public void imprimir() {
        if (reais > 1000 || reais < -1000) {
            System.out.println("Erro ao imprimir valor.");
        } else {
            System.out.println("R$:" + this.reais);
        }
    }

    /**
     * Metodo para imprimir o valor por extenso
     */
    public void imprimirPorExtenso() {

        // teste inicial para que nao imprima algo que nao pode ser setado
        if (reais > 1000 || reais < -1000) {
            System.out.println("Erro ao imprimir valor.");
        } else {

            //teste do zero
            if (reais == 0) {
                System.out.println("Zero reais.");
            }

            //teste para verificar se é negativo
            if (reais < 0) {
                reais = reais * (-1);
                System.out.print("Menos ");
            }

            long inteiro = (long) Math.abs(reais); // parte inteira do valor
            int resto = (int) Math.round((reais - (int) reais) * 100); // parte fracionaria

            //String centavos = String.valueOf((int) Math.round(resto * 100));
            String[] unidade = {"", "um", "dois", "três", "quatro", "cinco", "seis",
                "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze",
                "quinze", "dezesseis", "dezesete", "dezoito", "dezenove"};

            String[] dezena = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
                "sessenta", "setenta", "oitenta", "noventa", "cem"};

            String[] centena = {"", "cento", "duzentos", "trezentos", "quatrocentos",
                "quinhentos", "seiscentos", "setecentos", "oitocentos",
                "novecentos"};

            String[] millhar = {"mil"};

            //teste para a parte inteira
            //teste para 1000
            if (inteiro == 1000) {
                System.out.print("Mil reais.");

                // teste de 999 a 99
            } else if (inteiro < 999 && inteiro > 99) {
                int auxCent = (int) inteiro;
                int auxDez = auxCent % 100;
                int auxUni = auxDez % 10;  //valor final da unidade

                int centAux = auxCent - auxDez;
                int dezAux = auxDez - auxUni;

                // teste para dezenas terminadas em 0
                if (dezAux % 10 == 0) {
                    int cent = centAux / 100;
                    int dez = dezAux / 10;
                    System.out.print(centena[cent] + " e " + dezena[dez] + " reais");
                } else {
                    int cent = centAux / 100;
                    int dez = dezAux / 10;

                    System.out.print(centena[cent] + " e " + dezena[dez] + " e " + unidade[auxUni] + " reais");
                }

                // teste de 99 a 19
            } else if (inteiro < 99 && inteiro > 19) {

                int dezAux = (int) inteiro;
                int uni = dezAux % 10;

                int dez = dezAux - uni;
                dez = dez / 10;

                System.out.print(dezena[dez] + " e " + unidade[uni] + " reais");

            } else if (inteiro < 19) {
                int inteiroAux = (int) inteiro;
                System.out.print(unidade[inteiroAux] + " reais");
            }

            //teste para a parte fracionaria
            if (resto != 0) {
                if (resto < 99 && resto > 19) {
                    int dez = (int) resto;
                    int uni = dez % 10;

                    dez = dez - uni;
                    dez = dez / 10;

                    System.out.println(" e " + dezena[dez] + " e " + unidade[uni] + " centavos");

                } else if (resto < 19) {
                    int restoAux = (int) resto;
                    System.out.println(" e " + unidade[restoAux] + " centavos");
                }

            }
        }
    }

}
