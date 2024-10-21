package com.fatec.banconosql.Model;

import java.util.UUID; // Importando a classe UUID
import org.springframework.data.cassandra.core.mapping.Table; // Importando a anotação Table
import org.springframework.data.annotation.Id; // Importando a anotação Id

@Table("ClientePedidos")
public class Cliente {
    @Id
    private UUID clienteId;
    private String nome;
    private String endereco;
    private String email;

    // Getters e Setters

    public UUID getClienteId() {
        return clienteId;
    }

    public void setClienteId(UUID clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
