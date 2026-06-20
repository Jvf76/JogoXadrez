package main.java.com.xadrez;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Posicao;
import main.java.com.xadrez.jogo.Tabuleiro;
import main.java.com.xadrez.jogo.pecas.Torre;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(8,8);
        Torre torre = new Torre(tabuleiro, Cor.BRANCA);
        tabuleiro.colocarPeca(torre, new Posicao(3,3));

        boolean[][] d = torre.movimentosPossiveis();

        for (int linha = 0; linha < tabuleiro.getLinhas(); linha++) {
            for (int coluna = 0; coluna < tabuleiro.getColunas(); coluna++) {
                if (linha == 3 && coluna == 3) {
                    System.out.print("T ");
                } else if (d[linha][coluna]) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

    }
}
