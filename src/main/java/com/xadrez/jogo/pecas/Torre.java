package main.java.com.xadrez.jogo.pecas;

import main.java.com.xadrez.jogo.Cor;
import main.java.com.xadrez.jogo.Peca;
import main.java.com.xadrez.jogo.Tabuleiro;

public class Torre extends Peca {



    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }


    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] matriz = new boolean[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        verificaMovimentos(matriz,-1,0);
        verificaMovimentos(matriz,1,0);
        verificaMovimentos(matriz,0,-1);
        verificaMovimentos(matriz,0,1);
        return matriz;
    }

    private void verificaMovimentos(boolean[][] matriz, int incrementoLinha, int incrementoColuna){
        int colunaAtual  = getPosicao().getColuna() + incrementoColuna;
        int linhaAtual = getPosicao().getLinha() + incrementoLinha;

        while(tabuleiro.posicaoExiste(linhaAtual, colunaAtual)){
           Peca pecaEncontrada = tabuleiro.peca(linhaAtual,colunaAtual);
            if (pecaEncontrada == null){
                matriz[linhaAtual][colunaAtual] = true;
                    linhaAtual = linhaAtual + incrementoLinha;
                    colunaAtual = colunaAtual + incrementoColuna;
            }else{
                boolean corAliada = pecaEncontrada.getCor() == this.cor;
                if (!corAliada){
                    matriz[linhaAtual][colunaAtual] = true;
                    break;
                }
            }
        }
    }


}
