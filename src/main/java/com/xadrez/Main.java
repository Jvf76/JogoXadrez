package main.java.com.xadrez;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.PartidaXadrez;
import main.java.com.xadrez.jogo.Peca;
import main.java.com.xadrez.jogo.Posicao;
import main.java.com.xadrez.jogo.Tabuleiro;

public class Main {
    public static void main(String[] args) {
        PartidaXadrez partida = new PartidaXadrez();

        imprimirTabuleiro(partida.getTabuleiro());

        System.out.println("Jogador atual: " + partida.getJogadorAtual().getCor());
        System.out.println();

        partida.realizarMovimento(new Posicao(6, 4), new Posicao(4, 4));

        imprimirTabuleiro(partida.getTabuleiro());
        System.out.println("Jogador atual: " + partida.getJogadorAtual().getCor());
        System.out.println();

        partida.realizarMovimento(new Posicao(1, 4), new Posicao(3, 4));

        imprimirTabuleiro(partida.getTabuleiro());
        System.out.println("Jogador atual: " + partida.getJogadorAtual().getCor());
    }

    private static void imprimirTabuleiro(Tabuleiro tabuleiro) {
        for (int linha = 0; linha < tabuleiro.getLinhas(); linha++) {
            for (int coluna = 0; coluna < tabuleiro.getColunas(); coluna++) {
                Peca peca = tabuleiro.peca(linha, coluna);
                if (peca == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(letraDaPeca(peca) + " ");
                }
            }
            System.out.println();
        }
    }

    private static String letraDaPeca(Peca peca) {
        String nomeClasse = peca.getClass().getSimpleName();
        String letra;
        switch (nomeClasse) {
            case "Torre": letra = "T"; break;
            case "Cavalo": letra = "C"; break;
            case "Bispo": letra = "B"; break;
            case "Rainha": letra = "Q"; break;
            case "Rei": letra = "R"; break;
            case "Peao": letra = "P"; break;
            default: letra = "?";
        }
        if (peca.getCor() == Cor.PRETA) {
            return letra.toLowerCase();
        }
        return letra;
    }
}