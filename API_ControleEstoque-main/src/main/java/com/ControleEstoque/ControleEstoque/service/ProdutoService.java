package com.ControleEstoque.ControleEstoque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ControleEstoque.ControleEstoque.model.Produto;
import com.ControleEstoque.ControleEstoque.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    public List<Produto> listarTodos(){
        return repository.findAll();
    }

    public Optional<Produto> buscarporId(long id){
        return repository.findById(id);
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
 
}
