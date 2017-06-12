/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author Tutui
 */
public class Data {

    // atributos
    private int dia;
    private int mes;
    private int ano;

    // metodos
    //contrutor padrao
    public Data() {
    }

    // construtor para iniciar todos os metodos
    public Data(int dia, int mes, int ano) {

        if (dia > 31 || mes > 12) {
            System.out.println("Data inválida!");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Método que imprime o a data no dispositivo de saida padrao
     */
    public void imprimir() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    /**
     * Método para imprimir a data por extenso
     */
    public void imprimirPorExtenso() {

        String diaExt[] = {"um", "dois", "tres", "quatro", "cinco", "seis",
            "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze",
            "quinze", "dezesseis", "dezesete", "dezoito", "dezenove", "vinte",
            "vinte e um", "vinte e dois", "vinte e tres", "vinte e quatro",
            "vinte e cinco", "vinte e seis", "vinte e sete", "vinte e oito",
            "vinte e nove", "trinta", "trinta e um"};

        String mesExt[] = {"janeiro", "fevereiro", "março", "abril", "maio",
            "junho", "julho", "agosto", "setembro", "outubro", "novembro",
            "dezembro"};

        System.out.println("Dia " + diaExt[dia - 1] + " de " + mesExt[mes - 1] + " de " + ano + ".");

    }

}
