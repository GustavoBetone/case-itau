package com.example.demo.http.controller.dto.filtro;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteFiltro {

    private Integer id;
    private String nome;
    private String numconta;
    private String saldoconta;

}
