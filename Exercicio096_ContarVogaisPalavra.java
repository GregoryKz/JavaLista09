package dev_klaus.lista09;

import java.util.Scanner;

public class Exercicio096_ContarVogaisPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        do {
            System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
            palavra = sc.nextLine().toLowerCase();

            if (!palavra.equals("sair")) {
                int contador = 0;
                for (int i = 0; i < palavra.length(); i++) {
                    char c = palavra.charAt(i);
                    if ("aeiou".indexOf(c) != -1) {
                        contador++;
                    }
                }
                System.out.println("Quantidade de vogais: " + contador);
            }
        } while (!palavra.equals("sair"));

        sc.close();
    }
}
