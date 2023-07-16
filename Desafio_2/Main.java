package Desafio_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String arredonda;
        double valor;
        try (Scanner scan = new Scanner(System.in)) {
            scan.useLocale(Locale.US);
            System.out.println("Entre com o valor monetário: ");
            valor = scan.nextFloat();
        }
        Composicao composicao = new Composicao();
        arredonda = String.format(Locale.US, "%.2f", valor);
        composicao.setValor(Double.parseDouble(arredonda));
        composicao.setContagem(0);

        Calculadora calculadora = new Calculadora();
        Double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        System.out.printf("NOTAS:");
        for (int i = 0; i < notas.length; i++){
            composicao = calculadora.valores(composicao, notas[i]);
            arredonda = String.format(Locale.US, "%.2f", notas[i]);
            System.out.printf("\n%d\tnota(s)\t\tde\tR$\t%s", composicao.getContagem(), arredonda);
        }
        Double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.printf("\nMOEDAS:");
        for (int i = 0; i < moedas.length; i++){
            composicao = calculadora.valores(composicao, moedas[i]);
            arredonda = String.format(Locale.US, "%.2f", moedas[i]);
            System.out.printf("\n%d\tmoeda(s)\tde\tR$\t%s", composicao.getContagem(), arredonda);
        }
    }
}