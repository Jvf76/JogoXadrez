package main.java.com.xadrez.jogo;

public abstract class Peca {
    protected Posicao posicao;
    protected Tabuleiro tabuleiro;
    protected Cor cor;

    public Peca(Tabuleiro tabuleiro, Cor cor){
        this.tabuleiro = tabuleiro;
        this.cor = cor;

    }

    public abstract boolean[][] movimentosPossiveis();
    
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public Cor getCor(){
        return this.cor;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
}
