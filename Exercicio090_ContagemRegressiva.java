package dev_klaus.lista09;

import java.util.Scanner;

public class Exercicio090_ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n >= 0);

        sc.close();
    }
}
