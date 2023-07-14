package br.com.banco.domain.repository;

import br.com.banco.domain.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author johnv
 */

@Repository
public interface ContaRepopsitory extends JpaRepository<Conta, Long> {

}
