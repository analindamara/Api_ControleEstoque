package com.ControleEstoque.ControleEstoque.model;

import jakarta.persistence.*;
import lombok.*;


@Entity

@Table(name = "produtos")

@Getter
@Setter

@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduto")
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private String stats;

}
