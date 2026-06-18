package main.java.com.xadrez.jogo;

public class PosicaoXadrez {
    private char coluna;
    private int linha;

    public PosicaoXadrez(char coluna, int linha){
        if((coluna<'a' || coluna > 'h') || (linha < 1 || linha > 8)){

               throw new RuntimeException("Posição Invalida ");
        }

        this.coluna = coluna;
        this.linha = linha;

    }



    public Posicao paraPosicao(){
       int linhaIndice = 8 - this.linha;
       int colunaIndice = this.coluna - 'a';
       return new Posicao(linhaIndice,colunaIndice);
    }




}
