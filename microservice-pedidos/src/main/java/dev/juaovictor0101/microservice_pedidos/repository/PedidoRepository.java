package dev.juaovictor0101.microservice_pedidos.repository;

import dev.juaovictor0101.microservice_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
