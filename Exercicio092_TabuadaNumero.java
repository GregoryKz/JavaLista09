package dev_klaus.lista09;

import java.util.Scanner;

public class Exercicio092_TabuadaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i = 1;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);

        sc.close();
    }
}
