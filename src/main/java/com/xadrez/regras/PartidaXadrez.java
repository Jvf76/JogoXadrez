package main.java.com.xadrez.jogo;

import main.java.com.xadrez.jogo.pecas.*;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;
    private Cor jogadorAtual;

    public PartidaXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        jogadorAtual = Cor.BRANCA;
        configuracaoInicial();
    }

    public Peca realizarMovimento(Posicao origem, Posicao destino) {
        Peca peca = tabuleiro.peca(origem);

        if (peca == null) {
            throw new RuntimeException("Não existe peça na posição de origem.");
        }

        if (peca.getCor() != jogadorAtual) {
            throw new RuntimeException("Essa peça não pertence ao jogador atual.");
        }

        boolean[][] movimentosPossiveis = peca.movimentosPossiveis();

        if (!movimentosPossiveis[destino.getLinha()][destino.getColuna()]) {
            throw new RuntimeException("Movimento inválido para essa peça.");
        }

        Peca pecaCapturada = tabuleiro.peca(destino);

        tabuleiro.colocarPeca(null, origem);
        tabuleiro.colocarPeca(peca, destino);

        proximoTurno();

        return pecaCapturada;
    }

    private void proximoTurno() {
        if (jogadorAtual == Cor.BRANCA) {
            jogadorAtual = Cor.PRETA;
        } else {
            jogadorAtual = Cor.BRANCA;
        }
    }

    private void configuracaoInicial() {
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

    public Cor getJogadorAtual() {
        return jogadorAtual;
    }
}