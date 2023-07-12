package br.com.banco.domain.exception;

public class ContaNaoEncontradaException extends EntidadeNaoEncontradaException{

    public ContaNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
