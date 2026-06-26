package main.java.com.xadrez.jogo.pecas;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Peca;
import main.java.com.xadrez.jogo.Tabuleiro;


public class Peao extends Peca {
    public Peao(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] matriz = new boolean[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        int linha = getPosicao().getLinha();
        int coluna = getPosicao().getColuna();
        int direcao;
        int linhaInicial;

        if (getCor() == Cor.BRANCA) {
            direcao = -1;
            linhaInicial = 6;
        } else {
            direcao = 1;
            linhaInicial = 1;
        }

        int linhaFrente = linha + direcao;


        if (tabuleiro.posicaoExiste(linhaFrente, coluna) && tabuleiro.peca(linhaFrente, coluna) == null) {
            matriz[linhaFrente][coluna] = true;


            if (linha == linhaInicial) {
                int linhaDoisFrente = linha + direcao + direcao;
                if (tabuleiro.posicaoExiste(linhaDoisFrente, coluna) && tabuleiro.peca(linhaDoisFrente, coluna) == null) {
                    matriz[linhaDoisFrente][coluna] = true;
                }
            }
        }

        int colunaEsquerda = coluna - 1;
        if (tabuleiro.posicaoExiste(linhaFrente, colunaEsquerda)) {
            Peca pecaEsquerda = tabuleiro.peca(linhaFrente, colunaEsquerda);
            if (pecaEsquerda != null && pecaEsquerda.getCor() != this.cor) {
                matriz[linhaFrente][colunaEsquerda] = true;
            }
        }


        int colunaDireita = coluna + 1;
        if (tabuleiro.posicaoExiste(linhaFrente, colunaDireita)) {
            Peca pecaDireita = tabuleiro.peca(linhaFrente, colunaDireita);
            if (pecaDireita != null && pecaDireita.getCor() != this.cor) {
                matriz[linhaFrente][colunaDireita] = true;
            }
        }

        return matriz;
    }
}