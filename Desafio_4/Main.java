package Desafio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] entrada;
        String x;
        int n, i = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Quantas linhas de casos de teste serão, entre com um número inteiro: ");
            n = scan.nextInt();
            entrada = new String[n];
            scan.nextLine();
            while(i < n) {
                x = scan.nextLine();
                entrada[i] = x;
                i++;
            }
        }
        Ordena ordena = new Ordena();
        entrada = ordena.ordena(entrada);
        System.out.println("\nExemplo de saída:");
        ordena.imprime(entrada);
    }
}
