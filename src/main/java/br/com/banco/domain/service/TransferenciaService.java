package br.com.banco.domain.service;

import br.com.banco.domain.exception.EntidadeNaoEncontradaException;
import br.com.banco.domain.model.Transferencia;
import br.com.banco.domain.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;


    public List<Transferencia> listaTransferencia(){
        return transferenciaRepository.findAll();
    }

    public Transferencia buscarOuFalhar(Long id){
        return transferenciaRepository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontradaException(
                        String.format("Codigo de Transferencia não encontrado ", id)));
    }
}
