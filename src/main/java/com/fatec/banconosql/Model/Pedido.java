package com.fatec.banconosql.Model;

import java.math.BigDecimal;
import java.util.UUID; // Importando a classe UUID
import org.springframework.data.cassandra.core.mapping.Table; // Importando a anotação Table
import org.springframework.data.annotation.Id; // Importando a anotação Id

@Table
public class Pedido {
    @Id
    private UUID pedidoId;
    private UUID produtoId;
    private int quantidade;
    private BigDecimal preco;
    private UUID clienteId;
    // Getters e Setters
    public UUID getPedidoId() {
        return pedidoId;
    }
    public void setPedidoId(UUID pedidoId) {
        this.pedidoId = pedidoId;
    }

    public UUID getProdutoId() {
        return produtoId;
    }
    public void setProdutoId(UUID produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
