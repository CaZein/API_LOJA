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
        Produto controle = new Produto(6, "Controle",
                "controle projetor", 102.99);


        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(garrafaAgua);
        this.produtos.add(controle);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }


    public List<Produto> buscarTodosProdutos() {

        return this.getProdutos();
    }

    public Produto buscarProdutoPeloId(int produtoId) {

        Produto produtoProcurado = null;
        for (Produto p : this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

    public Produto cadastrarNovoProduto(Produto novoProduto) {

        int ultimoIndex = this.produtos.size() - 1;
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        int proximoId = ultimoProduto.getId() + 1;

        novoProduto.setId(proximoId);
        this.produtos.add(novoProduto);
        return novoProduto;

    }

    public void atualizarProduto(int produtoId,
                                 Produto produtoAtualizar) {
        Produto produtoProcurado = this.buscarProdutoPeloId(produtoId);
        if (produtoProcurado != null) {
            produtoProcurado.setName(produtoAtualizar.getName());
            produtoProcurado.setDescricao(produtoAtualizar.getDescricao());
            produtoProcurado.setValorUnitario(produtoAtualizar.getValorUnitario());
        }
    }

    public void removerProduto(int produtoId) {
        Produto produtoRemover = this.buscarProdutoPeloId(produtoId);
        this.produtos.remove(produtoRemover);
    }


}

