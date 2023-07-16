package Desafio_1;
import java.util.Scanner;

public class Ordena{

    public int[] alimentarDados(){
        try (Scanner scan = new Scanner(System.in)) {
            int i = 0, tamanho;
            System.out.println("Entre a quantidade de elementos/linhas para a ordenação: (número entre 1 e 100.000)");
            tamanho = scan.nextInt();
            int[] valores = new int[tamanho+1];
            System.out.printf("Entre com %d números inteiros não negativos.", tamanho);
            for(i = 1; i < tamanho+1; i++){
                valores[i] = scan.nextInt();
            }
            scan.close();
            return valores;
        }
    }

    public int[] definePar(int valores[]){
        int aux = valores.length - 1;
        int[] vetor = new int[aux];
        int i, j = 0;
        for (i = 1; i < aux; i++){
            if (valores[i] % 2 == 0){
                vetor[j] = valores[i];
                j++;
            } else vetor[aux] = valores[i]; aux--;
        }
        return vetor;
    }

    public int[] shellsort(int v[]){
		int h = 1;
		do h = h * 3 + 1; while (h < v.length);
		do{
			h /= 3;
			for(int i = h + 1; i <= v.length-1; i++){
				int x = v[i];
				int j = i;
				while (v[j - h] > x){ 
					v[j] = v[j - h];
					j -= h;
					if (j <= h)
						break;
				}
				v[j] = x;
			}
		} while (h != 1);
		return v;
	}

    public void imprime(int[] v){
        for (int i = 1; i < v.length; i++) {
            if (v[i] % 2 == 0){
                System.out.println(v[i]);
            }
        }
        for (int j = v.length-1; j > 0; j--) {
            if (v[j] % 2 != 0){
                System.out.println(v[j]);
            }
        }
    }

}
