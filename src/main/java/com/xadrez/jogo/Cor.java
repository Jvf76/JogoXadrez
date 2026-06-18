package main.java.com.xadrez.jogo;

public enum Cor {
    PRETA("preta"),
    BRANCA("branca");

    private String cor;

    Cor(String cor) {
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }
}
