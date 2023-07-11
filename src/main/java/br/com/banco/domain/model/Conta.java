package br.com.banco.domain.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "conta")
public class Conta {

    @Id
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_conta;

    @Column(nullable = false)
    private String nome_responsavel;
}
