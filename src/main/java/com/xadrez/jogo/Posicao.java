package main.java.com.xadrez.jogo;

public class Posicao {
    private int linha;
    private int coluna;



    public Posicao(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    public void definirValor(int novaLinha , int novaColuna){
        this.linha = novaLinha;
        this.coluna = novaColuna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}
