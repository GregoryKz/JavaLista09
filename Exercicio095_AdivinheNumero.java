package dev_klaus.lista09;

import java.util.Random;
import java.util.Scanner;

public class Exercicio095_AdivinheNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int segredo = rand.nextInt(10) + 1;
        int tentativa;

        do {
            System.out.print("Adivinhe o número (1 a 10): ");
            tentativa = sc.nextInt();
        } while (tentativa != segredo);

        System.out.println("Parabéns! Você acertou.");
        sc.close();
    }
}
