package org.atv1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor de X (diferente de 0): ");
        int coordenadaX = entrada.nextInt();
        System.out.println("Informe o valor de Y: ");
        int coordenadaY = entrada.nextInt();
        if (coordenadaX > 0 && coordenadaY > 0) {
            System.out.println(1);
        } else if (coordenadaX < 0 && coordenadaY > 0) {
            System.out.println(2);
        } else if (coordenadaX < 0 && coordenadaY < 0) {
            System.out.println(3);
        } else if (coordenadaX > 0 && coordenadaY < 0) {
            System.out.println(4);
        }

        entrada.close();
    }
}