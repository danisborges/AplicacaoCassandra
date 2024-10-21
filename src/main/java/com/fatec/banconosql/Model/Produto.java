package com.fatec.banconosql.Model;

import java.math.BigDecimal;
import java.util.UUID; // Importando a classe UUID
import org.springframework.data.cassandra.core.mapping.Table; // Importando a anotação Table
import org.springframework.data.annotation.Id; // Importando a anotação Id

@Table
public class Produto {
    @Id
    private UUID produtoId;
    private String nome;
    private BigDecimal preco;
    private String categoria;

    // Getters e Setter
    public UUID getProdutoId() {
        return produtoId;
    }
    public void setProdutoId(UUID produtoId) {
        this.produtoId = produtoId;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    } 

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
