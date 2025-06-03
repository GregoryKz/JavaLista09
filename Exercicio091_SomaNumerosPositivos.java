package dev_klaus.lista09;

import java.util.Scanner;

public class Exercicio091_SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, soma = 0;

        do {
            System.out.print("Digite um número positivo: ");
            num = sc.nextInt();
            if (num >= 0) {
                soma += num;
            }
        } while (num >= 0);

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
