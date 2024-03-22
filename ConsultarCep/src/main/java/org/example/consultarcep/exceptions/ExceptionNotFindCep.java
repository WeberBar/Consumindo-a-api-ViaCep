package org.example.consultarcep.exceptions;

public class ExceptionNotFindCep extends RuntimeException{
    private String mensagem;

    public ExceptionNotFindCep(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {

        return mensagem;
    }
}
