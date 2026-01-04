package dev.juaovictor0101.microservice_produtos.controller;


import dev.juaovictor0101.microservice_produtos.model.Produto;
import dev.juaovictor0101.microservice_produtos.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository repo;

    public ProdutoController(ProdutoRepository repo) {
        this.repo = repo;
    }


    @GetMapping
    public List<Produto> listarProdutos(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id){
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Produto salvarProduto (@RequestBody Produto produto) {
        return repo.save(produto);
    }

}
