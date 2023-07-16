package Desafio_2;

public class Composicao {

    public int contagem;
    public double valor;


    public Composicao( ) {  }
    public Composicao(int contagem, double valor) {
        this.contagem = contagem;
        this.valor = valor;
    }


    public int getContagem() {
        return contagem;
    }
    public void setContagem(int contagem) {
        this.contagem = contagem;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
