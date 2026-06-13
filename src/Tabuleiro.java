public class Tabuleiro {
    private int linha;
    private int coluna;
    private Peca pecas[][];

    public Tabuleiro(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        this.pecas = new Peca[this.linha][this.coluna];
    }

    public Peca peca(int linha, int coluna){
        return this.pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao){
        return peca(posicao.getLinha(),posicao.getColuna());
    }

    public void colocarPeca(Peca peca, Posicao posicao){
        this.pecas[posicao.getLinha()][posicao.getColuna()] = peca;
    }

    public boolean posicaoExiste(int linha, int coluna){
        return (linha >= 0 && linha < this.linha && coluna>= 0 && coluna< this.coluna);
    }

    public boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(),posicao.getColuna());
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }


}
