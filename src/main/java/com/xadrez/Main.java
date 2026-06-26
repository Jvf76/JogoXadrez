package main.java.com.xadrez;

import main.java.com.xadrez.jogo.Peca;
import main.java.com.xadrez.jogo.Tabuleiro;
import main.java.com.xadrez.regras.PartidaXadrez;

public class Main {
    public static void main(String[] args) {
        PartidaXadrez partida = new PartidaXadrez();
        Tabuleiro tabuleiro = partida.getTabuleiro();

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
            case "Torre":
                letra = "T";
                break;
            case "Cavalo":
                letra = "C";
                break;
            case "Bispo":
                letra = "B";
                break;
            case "Rainha":
                letra = "Q";
                break;
            case "Rei":
                letra = "R";
                break;
            case "Peao":
                letra = "P";
                break;
            default:
                letra = "?";
        }
        if (peca.getCor() == main.java.com.xadrez.jogo.Cor.PRETA) {
            return letra.toLowerCase();
        }
        return letra;
    }
}