package com.example.demo.service.impl;


import com.example.demo.entity.Transferencia;
import com.example.demo.repository.TransferenciaRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Getter
@Setter
@Service
@RequiredArgsConstructor
public class TransferenciaService {

    private final TransferenciaRepository transferenciaRepository;

    public Optional<Transferencia> buscarPorValorTransferencia(Double valortransferencia){
        return TransferenciaRepository.findById(valortransferencia);
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public void creditar(double valor) {
        saldo += valor;
    }
}
