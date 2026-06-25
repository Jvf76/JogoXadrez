package main.java.com.xadrez.jogo.pecas;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Peca;
import main.java.com.xadrez.jogo.Tabuleiro;

public class Cavalo extends Peca {
    public Cavalo(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] matriz = new boolean[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        testaUmaCasa(matriz,2,1);
        testaUmaCasa(matriz,2,-1);
        testaUmaCasa(matriz,-2,1);
        testaUmaCasa(matriz,-2,-1);
        testaUmaCasa(matriz,1,2);
        testaUmaCasa(matriz,1,-2);
        testaUmaCasa(matriz,-1,2);
        testaUmaCasa(matriz,-1,-2);

        return matriz;
    }
}
