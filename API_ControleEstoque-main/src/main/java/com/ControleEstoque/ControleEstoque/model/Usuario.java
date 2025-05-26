package com.ControleEstoque.ControleEstoque.model;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Table(name = "usuario")

@Getter
@Setter

@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String setor;


}
