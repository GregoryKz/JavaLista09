package dev_klaus.lista09;

import java.util.Scanner;

public class Exercicio097_FatorialNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fatorial = 1, i = 1;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        do {
            fatorial *= i;
            i++;
        } while (i <= n);

        System.out.println("Fatorial de " + n + " é " + fatorial);
        sc.close();
    }
}
