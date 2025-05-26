package com.ControleEstoque.ControleEstoque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ControleEstoque.ControleEstoque.model.Usuario;
import com.ControleEstoque.ControleEstoque.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listarTodos(){
        return repository.findAll();
    }

    public Optional<Usuario> buscarporId(long id){
        return repository.findById(id);
    }

    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
 
}
