package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {

    List<Produto> produtos = new ArrayList<>();

    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta azul",
                "Caneta azul, azul caneta", 1.99);
        Produto borracha = new Produto(2, "Borracha branca",
                "Borracha quadrada e branca", 2.99);
        Produto apontador = new Produto(3, "Apontador quadrado",
                "apontador de 2 entradas", 15.99);
        Produto caderno = new Produto(4, "Caderno",
                "Caderno em aspiral 96 folhas", 32.99);
        Produto garrafaAgua = new Produto(5, "Garrafa de água",
                "Garrafa Stanley", 92.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(garrafaAgua);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }


    public List<Produto> buscarTodosProdutos() {
        return this.getProdutos();
    }
}
