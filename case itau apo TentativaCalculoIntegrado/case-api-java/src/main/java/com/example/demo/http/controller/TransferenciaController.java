package com.example.demo.http.controller;

import com.example.demo.service.impl.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/transferencia")
public class TransferenciaController;

    private TransferenciaService transferenciaService;

    @GetMapping("/realizarTransferencia")
    public String realizarTransferencia(@RequestParam String contaOrigem, @RequestParam String contaDestino, @RequestParam double valor) {
        Conta origem = contas.get(contaOrigem);
        Conta destino = contas.get(contaDestino);

        if (origem == null || destino == null) {
            return "Transferência não realizada. Conta de origem ou destino não encontrada.";
        }

        if (valor > 100.0) {
            return "Transferência não realizada. Valor da transferência excede R$100,00.";
        }

        if (origem.getSaldo() < valor) {
            return "Transferência não realizada. Saldo insuficiente na conta de origem.";
        }

        origem.debitar(valor);
        destino.creditar(valor);

        return "Transferência de R$" + valor + " realizada com sucesso.";
    }
}