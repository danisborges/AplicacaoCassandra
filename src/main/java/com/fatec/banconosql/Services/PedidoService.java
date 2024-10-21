package com.fatec.banconosql.Services;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.banconosql.Model.Pedido;
import com.fatec.banconosql.Repositorios.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    
    public Pedido realizarPedido(Pedido pedido) {
        pedido.setPedidoId(UUID.randomUUID());
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> buscarPedidosPorCliente(UUID clienteId) {
        return pedidoRepository.findByClienteId(clienteId);
    }
}
