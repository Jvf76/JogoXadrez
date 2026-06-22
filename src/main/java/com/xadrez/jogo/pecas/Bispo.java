package main.java.com.xadrez.jogo.pecas;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Peca;
import main.java.com.xadrez.jogo.Tabuleiro;

public class Bispo extends Peca {

    public Bispo(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }


    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] matriz = new boolean[tabuleiro.getLinhas()][tabuleiro.getColunas()];

        verificaMovimentos(matriz,-1,1);
        verificaMovimentos(matriz,-1,-1);
        verificaMovimentos(matriz,1,-1);
        verificaMovimentos(matriz,1,1);
        return matriz;
    }
}
