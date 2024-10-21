package com.fatec.banconosql.Services;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.banconosql.Model.Produto;
import com.fatec.banconosql.Repositorios.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public Produto cadastrarProduto(Produto produto) {
        produto.setProdutoId(UUID.randomUUID());
        return produtoRepository.save(produto);
    }

    public List<Produto> buscarPorCategoria(String categoria) {
        return produtoRepository.findByCategoria(categoria);
    }
}
