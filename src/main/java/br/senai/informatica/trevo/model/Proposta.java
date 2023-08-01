package br.senai.informatica.trevo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Proposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProposta;
    @Temporal(TemporalType.DATE)
    private LocalDate data;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    @ManyToMany
    @JoinTable(name = "produto_da_proposta",
        joinColumns = {@JoinColumn(name = "idProposta")},
        inverseJoinColumns = {@JoinColumn(name = "idProduto")})
    private Set<Produto> produtos;
}
