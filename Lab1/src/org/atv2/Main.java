package org.atv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa para calcular o último dígito do fatorial!");
        System.out.print("Informe a quantidade de testes: ");
        int quantidadeTestes = entrada.nextInt();

        if (quantidadeTestes < 1 || quantidadeTestes > 10) {
            System.out.println("Erro: A quantidade de testes deve estar entre 1 e 10.");
            return;
        }

        int[] resultadosFinais = new int[quantidadeTestes];

        for (int indiceTeste = 0; indiceTeste < quantidadeTestes; indiceTeste++) {
            System.out.print("Informe o valor de N para o teste #" + (indiceTeste + 1) + ": ");
            int numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("Erro: O número deve ser positivo.");
                return;
            }

            resultadosFinais[indiceTeste] = calcularUltimoDigitoFatorial(numero);
        }

        System.out.println("\nResultados obtidos:");
        for (int indiceTeste = 0; indiceTeste < quantidadeTestes; indiceTeste++) {
            System.out.println("Teste #" + (indiceTeste + 1) + ": Último dígito = " + resultadosFinais[indiceTeste]);
        }

        entrada.close();
    }

    public static int calcularUltimoDigitoFatorial(int numero) {
        if (numero >= 5) {
            return 0;
        }

        int resultadoFatorial = 1;
        for (int contador = 1; contador <= numero; contador++) {
            resultadoFatorial *= contador;
        }

        return resultadoFatorial % 10;
    }
}