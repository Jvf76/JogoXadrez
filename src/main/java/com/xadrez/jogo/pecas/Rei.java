package main.java.com.xadrez.jogo.pecas;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Peca;
import main.java.com.xadrez.jogo.Tabuleiro;

public class Rei extends Peca {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }


    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] matriz = new boolean[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        testaUmaCasa(matriz,1,0);
        testaUmaCasa(matriz,-1,0);
        testaUmaCasa(matriz,0,-1);
        testaUmaCasa(matriz,0,1);
        testaUmaCasa(matriz,1,-1);
        testaUmaCasa(matriz,1,1);
        testaUmaCasa(matriz,-1,1);
        testaUmaCasa(matriz,-1,-1);

        return matriz;
    }


}
