package com.ControleEstoque.ControleEstoque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ControleEstoque.ControleEstoque.model.Saida;
import com.ControleEstoque.ControleEstoque.repository.SaidaRepository;



@Service
public class SaidaService {

    @Autowired
    private SaidaRepository repository;

    public List<Saida> listarTodos(){
        return repository.findAll();
    }

    public Optional<Saida> buscarporId(long id){
        return repository.findById(id);
    }

    public Saida salvar(Saida saida){
        return repository.save(saida);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
