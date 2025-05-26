package com.ControleEstoque.ControleEstoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ControleEstoque.ControleEstoque.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
