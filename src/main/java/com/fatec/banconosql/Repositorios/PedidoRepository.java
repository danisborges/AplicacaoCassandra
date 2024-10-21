package com.fatec.banconosql.Repositorios;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import com.fatec.banconosql.Model.Pedido;
import java.util.List;
import java.util.UUID;

@Repository
public interface PedidoRepository extends CassandraRepository<Pedido, UUID> {
    List<Pedido> findByClienteId(UUID clienteId);
}
