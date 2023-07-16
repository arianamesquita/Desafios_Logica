package Desafio_4;

public class Ordena {

    public String[] ordena(String[] entrada){
        String ordena, aux, x, y;
        String[] array = new String[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            aux = entrada[i];
            ordena = new StringBuilder(aux).reverse().toString();
            x = ordena.substring(ordena.length()/2, ordena.length());
            y = ordena.substring(0, ordena.length()/2);
            aux = x + y;
            array[i] = aux;
        }
        return array;
    }

    public void imprime(String[] entrada){
        for (String string : entrada) {
            System.out.println(string);
        }
    }  
    
}
