package dev.juaovictor0101.microservice_pedidos.controller;


import dev.juaovictor0101.microservice_pedidos.model.Pedido;
import dev.juaovictor0101.microservice_pedidos.service.PedidoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }


    @PostMapping
    public Pedido Criar(@RequestParam Long produtoId, @RequestParam Integer quantidade){
        return pedidoService.criarPedido(produtoId, quantidade);
    }
}
