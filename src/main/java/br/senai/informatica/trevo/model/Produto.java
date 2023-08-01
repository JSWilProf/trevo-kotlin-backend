package br.senai.informatica.trevo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    @Column(unique = true, nullable = false)
    private String nome;
    @Column(nullable = false, columnDefinition = "CHARACTER LARGE OBJECT")
    private String descricao;
    @OneToOne
    @JoinColumn(name = "idArea")
    private Area area;
    @Column(nullable = false)
    private String imagem;
    @Column(nullable = false)
    private String capa;
    private boolean maisVendido;
    @ManyToMany
    @JoinTable(name = "culturas_do_produto",
        joinColumns = {@JoinColumn(name = "idProduto")},
        inverseJoinColumns = {@JoinColumn(name = "idCultura")})
    private Set<Cultura> culturas;
}
