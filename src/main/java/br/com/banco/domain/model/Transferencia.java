package br.com.banco.domain.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "transferencia")
public class Transferencia {

    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime data_transferencia;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String nome_operador_transacao;

    @ManyToOne
    @JoinColumn(name = "conta_id", nullable = false)
    private Conta conta;
}
