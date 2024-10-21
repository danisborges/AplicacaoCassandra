package com.fatec.banconosql.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import com.fatec.banconosql.Model.Pedido;
import com.fatec.banconosql.Services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido realizarPedido(@RequestBody Pedido pedido) {
        return pedidoService.realizarPedido(pedido);
    }

    @GetMapping("/cliente/{id}")
    public List<Pedido> buscarPedidosPorCliente(@PathVariable UUID id) {
        return pedidoService.buscarPedidosPorCliente(id);
    }
}
