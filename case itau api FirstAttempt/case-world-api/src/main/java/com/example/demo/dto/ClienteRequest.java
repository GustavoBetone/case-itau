package com.example.demo.dto;

public class ClienteRequest {
    private String nome;
    private Long numconta;
    private Long saldoconta;

    public ClienteRequest(Long saldoconta, Long numconta, String nome) {
        this.saldoconta = saldoconta;
        this.numconta = numconta;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getNumconta() {
        return numconta;
    }

    public void setNumconta(Long numconta) {
        this.numconta = numconta;
    }

    public Long getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(Long saldoconta) {
        this.saldoconta = saldoconta;
    }

    @Override
    public String toString() {
        return "ClienteDto{" +
                ", nome='" + nome + '\'' +
                ", numconta=" + numconta +
                ", saldoconta=" + saldoconta +
                '}';
    }
}
