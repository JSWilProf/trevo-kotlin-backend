package br.senai.informatica.trevo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArea;
    @Column(unique = true, nullable = false)
    private String tamanho;
}
