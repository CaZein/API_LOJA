package com.loja;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loja/produtos")
public class ProdutoController {

    private TabelaProdutos tabelaProdutos;

    public ProdutoController() {
        this.tabelaProdutos = new TabelaProdutos();
    }

    @GetMapping
    public List<Produto> buscarTodosProdutosLoja() {
        return this.tabelaProdutos.buscarTodosProdutos();
    }


    @GetMapping("/{produtoId}")
    public Produto buscarProdutoPeloIdNaLoja(@PathVariable int produtoId) {
        Produto produtoProcurado = this.tabelaProdutos.buscarProdutoPeloId(produtoId);
        return produtoProcurado;

    }

    @PostMapping
    public Produto cadastrarNovoProdutoNaLoja(
            @RequestBody Produto dadosNovoProduto) {
        return this.tabelaProdutos.cadastrarNovoProduto(dadosNovoProduto);
    }


    @PutMapping("/{produtoId}")
    public void atualizarProdutoNaLoja(@PathVariable int produtoId,
                                       @RequestBody Produto dadosAtulizarProduto) {
        this.tabelaProdutos.atualizarProduto(produtoId, dadosAtulizarProduto);
    }


    @DeleteMapping("/{produtoId}")
    public void removerProdutoLoja(@PathVariable int produtoId) {
        this.tabelaProdutos.removerProduto(produtoId);

    }


}





