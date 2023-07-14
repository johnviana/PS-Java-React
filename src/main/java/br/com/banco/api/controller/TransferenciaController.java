package br.com.banco.api.controller;

import br.com.banco.domain.model.Transferencia;
import br.com.banco.domain.repository.TransferenciaRepository;
import br.com.banco.domain.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author johnv
 */


@RestController
@RequestMapping(value = "/api/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService transferenciaService;

    @Autowired
    private TransferenciaRepository transferenciaRepository;


    @GetMapping
    public ResponseEntity<List<Transferencia>> getTransferencias(
            @RequestParam(required = false) Long contaId,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate,
            @RequestParam(required = false) String nomeOperadorTransacao
    ) {
        List<Transferencia> transferencias;
        if (contaId != null) {
            transferencias = transferenciaService.obterTransferenciasPorConta(contaId);
        } else if (startDate != null && endDate != null && nomeOperadorTransacao != null) {
            transferencias = transferenciaService.obterTransferenciasPorPeriodoENomeOperador(
                    startDate, endDate, nomeOperadorTransacao
            );
        } else if (startDate != null && endDate != null) {
            transferencias = transferenciaService.obterTransferenciasPorPeriodo(startDate, endDate);
        } else if (nomeOperadorTransacao != null) {
            transferencias = transferenciaService.obterTransferenciasPorNomeOperador(nomeOperadorTransacao);
        } else {
            transferencias = transferenciaService.obterTodasTransferencias();
        }

        return ResponseEntity.ok(transferencias);
    }

}