package Desafio_1;

public class Main {
    public static void main(String[] args) {
        Ordena ordena = new Ordena();
        int[] vetor = ordena.alimentarDados();
        ordena.shellsort(vetor);
        ordena.definePar(vetor);
        System.out.println("\n----- Exemplo de saída: -----");
        ordena.imprime(vetor);
    }
    
}
