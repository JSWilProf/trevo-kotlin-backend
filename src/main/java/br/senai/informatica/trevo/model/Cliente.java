package br.senai.informatica.trevo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(unique = true, nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefone;
}
