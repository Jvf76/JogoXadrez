package main.java.com.xadrez.jogo;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca pecas[][];

    public Tabuleiro(int linha, int coluna){
        this.linhas = linha;
        this.colunas = coluna;
        this.pecas = new Peca[this.linhas][this.colunas];
    }

    public Peca peca(int linha, int coluna){
        return this.pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao){
        return peca(posicao.getLinha(),posicao.getColuna());
    }

    public void colocarPeca(Peca peca, Posicao posicao){
        this.pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        if (peca != null) {
            peca.setPosicao(posicao);
        }
    }

    public boolean posicaoExiste(int linha, int coluna){
        return (linha >= 0 && linha < this.linhas && coluna>= 0 && coluna< this.colunas);
    }

    public boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(),posicao.getColuna());
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }


}
