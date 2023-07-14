package br.com.banco.domain.service;

import br.com.banco.domain.model.Transferencia;
import br.com.banco.domain.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author johnv
 */

@Service
public class TransferenciaService {

    @Autowired
    private  TransferenciaRepository transferenciaRepository;


    public List<Transferencia> obterTransferenciasPorConta(Long contaId) {
        return transferenciaRepository.findByContaId(contaId);
    }


}
