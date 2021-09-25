package br.com.supera.game.store.util;

public class Constantes {

    public interface Status {
        int CODIGO_SUCESSO = 0;
        int CODIGO_ERRO = -1;
    }

    public interface Url {
        String URL_PRODUTO = "/produto";
        String URL_CARRINHO = "/carrinho";
        String URL_LIMPAR_CARRINHO = "/carrinho/limpar";
    }
}
