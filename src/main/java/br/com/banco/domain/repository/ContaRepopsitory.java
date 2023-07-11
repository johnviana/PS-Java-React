package br.com.banco.domain.repository;

import br.com.banco.domain.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepopsitory extends JpaRepository<Conta, Long> {
}
