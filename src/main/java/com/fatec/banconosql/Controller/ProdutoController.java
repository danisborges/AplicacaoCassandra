package com.fatec.banconosql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.fatec.banconosql.Model.Produto;
import com.fatec.banconosql.Services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoService.cadastrarProduto(produto);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Produto> buscarPorCategoria(@PathVariable String categoria) {
        return produtoService.buscarPorCategoria(categoria);
    }
}
