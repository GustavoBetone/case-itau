package com.example.demo.dto;

public class ClienteResponse {
    private Integer id;
    private String nome;
    private Long numconta;
    private Long saldoconta;

    public ClienteResponse(Integer id, Long saldoconta, Long numconta, String nome) {
        this.id = id;
        this.saldoconta = saldoconta;
        this.numconta = numconta;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ndc=" + numconta +
                ", sdc=" + saldoconta +
                '}';
    }
}
