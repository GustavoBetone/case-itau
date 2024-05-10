package com.example.demo.entity;

// todos @ em amarelo fazer importacoes da biblioteca lambok gerida pelo Maven

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity adiciona entidades de banco de dados.

import java.io.Serializable;

@Data  // cria getter, setter e to string automaticamente
@AllArgsConstructor // cria o construtor automaticamente com as propriedades que colocar
@NoArgsConstructor // cria contrutor vazio sem argumentos
@Builder // ajuda na criacao de objetos cliente
@Entity // informa que e uma entidade de banco de dados

public class Cliente {

    // @Id define a primaryKey do banco de dados.
    // @GeneratedValue(strategy = GenerationType.AUTO) serve para gerar o Id automaticamente.
    // nullable = false obriga o campo a ser preenchido.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "numconta", nullable = false)
    private String numconta;

    @Column(name = "saldoconta", nullable = false)
    private String saldoconta;

}
