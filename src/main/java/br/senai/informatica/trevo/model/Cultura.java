package br.senai.informatica.trevo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cultura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCultura;
    @Column(unique = true, nullable = false)
    private String nome;
}
