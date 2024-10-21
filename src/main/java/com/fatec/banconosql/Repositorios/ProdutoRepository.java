package com.fatec.banconosql.Repositorios;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import com.fatec.banconosql.Model.Produto;
import java.util.List;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends CassandraRepository<Produto, UUID> {
    List<Produto> findByCategoria(String categoria);
}
