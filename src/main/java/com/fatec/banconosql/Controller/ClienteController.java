package com.fatec.banconosql.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import com.fatec.banconosql.Model.Cliente;
import com.fatec.banconosql.Services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        return clienteService.cadastrarCliente(cliente);
    }

    @GetMapping("/{id}")
    public java.util.Optional<Cliente> buscarCliente(@PathVariable UUID id) {
        return clienteService.buscarCliente(id);
    }
}
