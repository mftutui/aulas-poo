package poo;

import java.util.Scanner;

/**
 * Esse programa Java permite o usuário converter as seguintes unidades:
 *
 * - Quilogramas <-> libras - Km/h <-> Milhas/h - Celsius <-> Fahrenheit
 *
 */
public class Principal {

    /**
     * Converte Quilogramas <-> Libras
     *
     * @param valor em kg ou lb que deve ser convertido
     * @param sentido true kg->lb, false lg->kg
     * @return o valor convertido de uma unidade para a outra
     */
    public double kgLibra(double valor, boolean sentido) {
        double resultado;

        // TODO preciso tratar o parâmetro booleano
        // 1 kg ~= 2.20 lb
        if (sentido == true) {
            resultado = valor * (double) 2.20;
        } else {
            resultado = valor / (double) 2.20;
        }
        return resultado;
    }

    /**
     * Converte Quilometros/h <-> Milhas/h
     *
     * @param valor em km/h ou milhas/h que deve ser convertido
     * @param sentido true km/h->milhas/h, false milhas/h->km/h
     * @return o valor convertido de uma unidade para a outra
     */
    public double kmMilha(double valor, boolean sentido) {
        double resultado; // = valor; (não entendi)

        if (sentido == true) {
            resultado = valor * (double) 0.621;
        } else {
            resultado = valor / (double) 0.621;
        }
        return resultado;
    }

    /**
     * Converte Célcius <-> Fahrenheit
     *
     * @param valor em celcius ou fahrenheit que deve ser convertido
     * @param sentido true celcius->fahrenheit, false fahreinheit->celcius
     * @return o valor convertido de uma unidade para a outra
     */
    public double celsiusFahrenheit(double valor, boolean sentido) {
        double resultado; // = valor; (não entendi)

        if (sentido == true) {
            resultado = (valor * (double) 1.8) + 32;
        } else {
            resultado = (valor - 32) / (double) 1.8;
        }
        return resultado;
    }

    /**
     * Menu de opções
     *
     * @return a opção escolhida pelo usuário
     */
    public int menuDeOpcoes() {
        Scanner teclado = new Scanner(System.in);
        int op = 0;

        System.out.println("..:: Escolha uma opção ::..\n");
        System.out.println("1. Conversão de massa");
        System.out.println("2. Conversão de velocidade");
        System.out.println("3. Conversão de temperatura");
        System.out.println("4. Sair\n");
        System.out.print("Qual a opção desejada: ");
        op = teclado.nextInt();

        return op;
    }

    /**
     * Método principal
     *
     * @param args argumentos de linha de comando
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = 0;
        double retorno;
        int aux;

        // Criando uma instância da classe Principal
        Principal p = new Principal();

        while (true) {
            //invocando menu
            int opcao = p.menuDeOpcoes();
            //System.out.println("Você escolheu a opção: " + opcao);

            switch (opcao) {
                case 1: //Conversão de massa
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1 - Quilogramas para Libras");
                    System.out.println("2 - Libras para Quilogramas");
                    aux = teclado.nextInt();
                    switch (aux) {
                        case 1:
                            //Quilogramas para Libras
                            System.out.println("Digite o valor que você dejesa converter: ");
                            valor = teclado.nextInt();
                            retorno = p.kgLibra(valor, true);
                            System.out.println("O resultado é: " + retorno + "\n");
                            break;
                        case 2:
                            //Libras para Quilogramas
                            System.out.println("Digite o valor que você dejesa converter: ");
                            valor = teclado.nextInt();
                            retorno = p.kgLibra(valor, false);
                            System.out.println("O resultado é: " + retorno + "\n");
                            break;
                        default:
                            System.out.println("Carácter inválido!" + "\n");
                            break;
                    }
                    break;
                case 2: //Conversão de velocidade
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1 - Quilômetro/hora para Milha/hora");
                    System.out.println("2 - Milha/hora para Quilômetro/hora");
                    aux = teclado.nextInt();
                    System.out.println("Digite o valor que você dejesa converter: ");

                    switch (aux) {
                        case 1:
                            //Quilômetro/hora para Milha/hora
                            System.out.println("Digite o valor que você dejesa converter: ");
                            valor = teclado.nextInt();
                            retorno = p.kmMilha(valor, true);
                            System.out.println("O resultado é: " + retorno + "\n");
                            break;
                        case 2:
                            //Milha/hora para Quilômetro/hora
                            System.out.println("Digite o valor que você dejesa converter: ");
                            valor = teclado.nextInt();
                            retorno = p.kmMilha(valor, false);
                            System.out.println("O resultado é: " + retorno + "\n");
                            break;
                        default:
                            System.out.println("Carácter inválido!" + "\n");
                            break;
                    }
                    break;
                case 3: //Conversão de temperatura
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1 - Celsius para Fahrenheit");
                    System.out.println("2 - Fahrenheit para Celsius");
                    aux = teclado.nextInt();
                    System.out.println("Digite o valor que você dejesa converter: ");

                    switch (aux) {
                        case 1:
                            //Celsius para Fahrenheit
                            System.out.println("Digite o valor que você dejesa converter: ");
                            valor = teclado.nextInt();
                            retorno = p.celsiusFahrenheit(valor, true);
                            System.out.println("O resultado é: " + retorno + "\n");
                            break;
                        case 2:
                            //Fahrenheit para Celsius
                            System.out.println("Digite o valor que você dejesa converter: ");
                            valor = teclado.nextInt();
                            retorno = p.celsiusFahrenheit(valor, false);
                            System.out.println("O resultado é: " + retorno + "\n");
                            break;
                        default:
                            System.out.println("Carácter inválido!" + "\n");
                            break;
                    }
                    break;
                case 4: //Sair
                    System.out.println("Até logo!" + "\n");
                    return;
                default: //Opção inválida
                    System.out.println("Opção inválida!" + "\n");
                    break;
            }
        }
    }

}
