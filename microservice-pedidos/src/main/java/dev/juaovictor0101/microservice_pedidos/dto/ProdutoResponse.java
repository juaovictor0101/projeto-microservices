package dev.juaovictor0101.microservice_pedidos.dto;

import java.math.BigDecimal;

public record ProdutoResponse(Long id, String nome, BigDecimal preco) {
}
