package Desafio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int tamanho, alvo;
        int[] array;
        System.out.println("Entre o tamanho da matriz e o valor alvo: ");
        try (Scanner scan = new Scanner(System.in)) {
            tamanho = scan.nextInt();
            alvo = scan.nextInt();
            array = new int[tamanho];
            System.out.printf("Entre os %s números do array:", tamanho);
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }
        }

        Compara compara = new Compara();
        System.out.println("Saída:\n" + compara.compara(array, alvo));
    }
    
}
