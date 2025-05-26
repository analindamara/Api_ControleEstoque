package com.ControleEstoque.ControleEstoque.model;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Entity

@Table(name = "saida")

@Getter
@Setter

@NoArgsConstructor
public class Saida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSaida")
    private long id;

    @Column(nullable = false)
    private LocalDate dataSaida;

    @ManyToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "idProduto", foreignKey = @ForeignKey(name = "FK_Produto_Saida"))
    private Produto produto; // referência à entidade

    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", foreignKey = @ForeignKey(name = "FK_Usuario_Saida"))
    private Usuario usuario; // referência à entidade

    @Column(nullable = false)
    private int quantidade_saida;
}
