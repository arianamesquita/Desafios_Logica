package Desafio_3;

public class Compara {

    public int compara(int[] v, int alvo){
        int i, j, count = 0;
        for(i = v.length-1; i >= 0; i--){
            for (j = 0; j < v.length; j++) {
                if (v[i] > v[j] && v[i] - v[j] == alvo){
                    count++;
                }
            }
        }
        return count;
    }
    
}
