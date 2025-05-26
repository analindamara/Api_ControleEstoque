package com.ControleEstoque.ControleEstoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ControleEstoque.ControleEstoque.model.Saida;

@Repository
public interface SaidaRepository extends JpaRepository<Saida, Long>{
    
} 


