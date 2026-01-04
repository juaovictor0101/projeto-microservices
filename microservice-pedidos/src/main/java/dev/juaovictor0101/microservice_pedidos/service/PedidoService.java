package dev.juaovictor0101.microservice_pedidos.service;

import dev.juaovictor0101.microservice_pedidos.client.ProdutoClient;
import dev.juaovictor0101.microservice_pedidos.dto.ProdutoResponse;
import dev.juaovictor0101.microservice_pedidos.model.Pedido;
import dev.juaovictor0101.microservice_pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PedidoService {

    private final ProdutoClient produtoClient;
    private final PedidoRepository pedidoRepository;


    public PedidoService(ProdutoClient produtoClient, PedidoRepository produtoRepository, PedidoRepository pedidoRepository) {
        this.produtoClient = produtoClient;
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido criarPedido (Long produtoId, Integer quantidade){
        ProdutoResponse produtoResponse = produtoClient.buscarPorId(produtoId);
        Pedido pedido = new Pedido();
        pedido.setProdutoId(produtoId);
        pedido.setQuantidade(quantidade);
        pedido.setValorTotal(produtoResponse.preco().multiply(new BigDecimal(quantidade)));
        return pedidoRepository.save(pedido);
    }
}
