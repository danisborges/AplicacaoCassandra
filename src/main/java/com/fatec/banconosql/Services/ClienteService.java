package com.fatec.banconosql.Services;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.banconosql.Model.Cliente;
import com.fatec.banconosql.Repositorios.ClienteRepository;


@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    
    public Cliente cadastrarCliente(Cliente cliente) {
        cliente.setClienteId(UUID.randomUUID());
        return clienteRepository.save(cliente);
    }

    public java.util.Optional<Cliente> buscarCliente(UUID clienteId) {
        return clienteRepository.findById(clienteId);
    }
}