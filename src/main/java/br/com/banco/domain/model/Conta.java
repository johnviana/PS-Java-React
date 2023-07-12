package br.com.banco.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "conta")
public class Conta {

    @Id
    @Column(name = "id_conta", nullable = false)
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;

    @Column(nullable = false)
    private String nome_responsavel;
}
