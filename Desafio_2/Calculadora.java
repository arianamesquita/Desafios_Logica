package Desafio_2;

public class Calculadora {

    public Composicao valores(Composicao x, double y){
        double valor = x.getValor();
        int count = 0;
        while (valor >= y){
            valor = valor - y;
            count ++;
        }
        x.setContagem(count);
        x.setValor(valor);

        return x;
    }
    
}
