package com.fatec.banconosql.Repositorios;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import com.fatec.banconosql.Model.Cliente;
import java.util.UUID;

@Repository
public interface ClienteRepository extends CassandraRepository<Cliente, UUID> {
}