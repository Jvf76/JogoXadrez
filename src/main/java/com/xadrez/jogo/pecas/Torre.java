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
        int linha = getPosicao().getLinha();
        int coluna = getPosicao().getColuna();
        int linhaTesteBaixo = linha + 1;
        int linhaTesteCima = linha - 1;
        int colunaTesteEsquerda = coluna -1;
        int colunaTesteDireita = coluna +1;
        boolean[][] matriz = new boolean[tabuleiro.getLinhas()][tabuleiro.getColunas()];

        while(tabuleiro.posicaoExiste(linhaTesteBaixo, coluna)){
            Peca pecaEncontrada = tabuleiro.peca(linhaTesteBaixo, coluna);
            if (pecaEncontrada == null){
                matriz[linhaTesteBaixo][coluna] = true;
                linhaTesteBaixo++;
            }else{
                boolean corAliada = pecaEncontrada.getCor() == this.cor;
                if (!corAliada){
                    matriz[linhaTesteBaixo][coluna] = true;
                    break;
                }
            }
        }

        while(tabuleiro.posicaoExiste(linhaTesteCima, coluna)){
            Peca pecaEncontrada = tabuleiro.peca(linhaTesteCima, coluna);
            if (pecaEncontrada == null){
                matriz[linhaTesteCima][coluna] = true;
                linhaTesteCima--;
            }else{
                boolean corAliada = pecaEncontrada.getCor() == this.cor;
                if (!corAliada){
                    matriz[linhaTesteCima][coluna] = true;
                    break;
                }
            }
        }

        while(tabuleiro.posicaoExiste(linha, colunaTesteEsquerda)){
            Peca pecaEncontrada = tabuleiro.peca(linha, colunaTesteEsquerda);
            if (pecaEncontrada == null){
                matriz[linha][colunaTesteEsquerda] = true;
                colunaTesteEsquerda--;
            }else{
                boolean corAliada = pecaEncontrada.getCor() == this.cor;
                if (!corAliada){
                    matriz[linha][colunaTesteEsquerda] = true;
                    break;
                }
            }
        }

        while(tabuleiro.posicaoExiste(linha, colunaTesteDireita)){
            Peca pecaEncontrada = tabuleiro.peca(linha, colunaTesteDireita);
            if (pecaEncontrada == null){
                matriz[linha][colunaTesteDireita] = true;
                colunaTesteDireita++;
            }else{
                boolean corAliada = pecaEncontrada.getCor() == this.cor;
                if (!corAliada){
                    matriz[linha][colunaTesteDireita] = true;
                    break;
                }
            }
        }


        return matriz;
    }


}
