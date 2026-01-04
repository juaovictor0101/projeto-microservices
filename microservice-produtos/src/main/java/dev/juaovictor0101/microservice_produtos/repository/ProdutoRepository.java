package dev.juaovictor0101.microservice_produtos.repository;

import dev.juaovictor0101.microservice_produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
