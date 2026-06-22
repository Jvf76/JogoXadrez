package main.java.com.xadrez.jogo;

public abstract class Peca {
    protected Posicao posicao;
    protected Tabuleiro tabuleiro;
    protected Cor cor;

    public Peca(Tabuleiro tabuleiro, Cor cor){
        this.tabuleiro = tabuleiro;
        this.cor = cor;

    }

    public abstract boolean[][] movimentosPossiveis();

    protected void verificaMovimentos(boolean[][] matriz, int incrementoLinha, int incrementoColuna){
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
                break;
            }
        }
    }


    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public Cor getCor(){
        return this.cor;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
}
