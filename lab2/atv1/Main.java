package lab2.atv1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySet mySet = new MySet();
        System.out.println("Digite números inteiros positivos. Digite um número negativo para encerrar.");
        while (true) {
            try {
                int number = scanner.nextInt();

                if (number < 0) {
                    break;
                }

                mySet.add(number);
            } catch (Exception e) {
                System.out.println("Mensagem de exceção: " + e.getMessage());
            }
        }
        mySet.printSet();
        scanner.close();
    }
}
