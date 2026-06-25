package main.java.com.xadrez.jogo.pecas;
import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Peca;
import main.java.com.xadrez.jogo.Tabuleiro;


public class Peao extends Peca {
    public Peao(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    public boolean[][] movimentosPossiveis() {
        boolean[][] matriz = new boolean[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        if ( getCor() == Cor.BRANCA){
            testaUmaCasa(matriz,-1,0);

        }else{

        }

        return matriz;
    }
}
