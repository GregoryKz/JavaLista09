package dev_klaus.lista09;

import java.util.Scanner;

public class Exercicio094_MediaNotasValidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite uma nota (0 a 10): ");
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            }
        } while (nota >= 0 && nota <= 10);

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        sc.close();
    }
}
