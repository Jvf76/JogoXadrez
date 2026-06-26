package main.java.com.xadrez.regras;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Posicao;
import main.java.com.xadrez.jogo.Tabuleiro;
import main.java.com.xadrez.jogo.pecas.*;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    public PartidaXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        configuracaoInicial();
    }

    private void configuracaoInicial() {
        // Peças pretas (linhas 0 e 1)
        tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.PRETA), new Posicao(0, 0));
        tabuleiro.colocarPeca(new Cavalo(tabuleiro, Cor.PRETA), new Posicao(0, 1));
        tabuleiro.colocarPeca(new Bispo(tabuleiro, Cor.PRETA), new Posicao(0, 2));
        tabuleiro.colocarPeca(new Rainha(tabuleiro, Cor.PRETA), new Posicao(0, 3));
        tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETA), new Posicao(0, 4));
        tabuleiro.colocarPeca(new Bispo(tabuleiro, Cor.PRETA), new Posicao(0, 5));
        tabuleiro.colocarPeca(new Cavalo(tabuleiro, Cor.PRETA), new Posicao(0, 6));
        tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.PRETA), new Posicao(0, 7));
        for (int coluna = 0; coluna < tabuleiro.getColunas(); coluna++) {
            tabuleiro.colocarPeca(new Peao(tabuleiro, Cor.PRETA), new Posicao(1, coluna));
        }

        // Peças brancas (linhas 7 e 6)
        tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCA), new Posicao(7, 0));
        tabuleiro.colocarPeca(new Cavalo(tabuleiro, Cor.BRANCA), new Posicao(7, 1));
        tabuleiro.colocarPeca(new Bispo(tabuleiro, Cor.BRANCA), new Posicao(7, 2));
        tabuleiro.colocarPeca(new Rainha(tabuleiro, Cor.BRANCA), new Posicao(7, 3));
        tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCA), new Posicao(7, 4));
        tabuleiro.colocarPeca(new Bispo(tabuleiro, Cor.BRANCA), new Posicao(7, 5));
        tabuleiro.colocarPeca(new Cavalo(tabuleiro, Cor.BRANCA), new Posicao(7, 6));
        tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCA), new Posicao(7, 7));
        for (int coluna = 0; coluna < tabuleiro.getColunas(); coluna++) {
            tabuleiro.colocarPeca(new Peao(tabuleiro, Cor.BRANCA), new Posicao(6, coluna));
        }
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}