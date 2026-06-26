package main.java.com.xadrez;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Posicao;
import main.java.com.xadrez.jogo.Tabuleiro;
import main.java.com.xadrez.jogo.pecas.Peao;
import main.java.com.xadrez.jogo.pecas.Torre;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(8, 8);

        Peao peao = new Peao(tabuleiro, Cor.BRANCA);
        tabuleiro.colocarPeca(peao, new Posicao(4, 3));

        Torre torreAdversaria = new Torre(tabuleiro, Cor.PRETA);
        tabuleiro.colocarPeca(torreAdversaria, new Posicao(3, 2));

        boolean[][] d = peao.movimentosPossiveis();

        for (int linha = 0; linha < tabuleiro.getLinhas(); linha++) {
            for (int coluna = 0; coluna < tabuleiro.getColunas(); coluna++) {
                if (linha == 4 && coluna == 3) {
                    System.out.print("T ");
                } else if (linha == 3 && coluna == 2) {
                    System.out.print("A ");
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