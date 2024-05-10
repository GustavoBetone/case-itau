package com.example.demo.dto;

public class TransferenciaDto {
    private Integer id;
    private Double saldo;
    private Long ddt;
    private Long ndc;

    public TransferenciaDto(Long ddt, Long ndc, Double saldo, Integer id) {
        this.ddt = ddt;
        this.ndc = ndc;
        this.saldo = saldo;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Long getDdt() {
        return ddt;
    }

    public void setDdt(Long ddt) {
        this.ddt = ddt;
    }

    public Long getNdc() {
        return ndc;
    }

    public void setNdc(Long ndc) {
        this.ndc = ndc;
    }

    @Override
    public String toString() {
        return "TransferenciaDto{" +
                "id=" + id +
                ", saldo=" + saldo +
                ", ddt=" + ddt +
                ", ndc=" + ndc +
                '}';
    }

    void depositar(Double valor){
        saldo = saldo + valor;
    }

    void sacar(Double valor){
        saldo = saldo - valor;
    }

}
