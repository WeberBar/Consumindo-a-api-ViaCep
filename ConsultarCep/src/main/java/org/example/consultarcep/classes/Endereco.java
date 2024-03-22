package org.example.consultarcep.classes;

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;


    private String uf;

    public Endereco(EnderecoApi enderecoApi) {
        this.logradouro = enderecoApi.logradouro();
        this.bairro = enderecoApi.bairro();
        this.cidade = enderecoApi.localidade();
        this.uf = enderecoApi.uf();
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String complemento) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", complemento='" + cidade + '\'' +
                '}';
    }

}
