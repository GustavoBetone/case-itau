package com.example.demo.http.controller;

import com.example.demo.entity.Cliente;
import com.example.demo.http.controller.dto.filtro.ClienteFiltro;
import com.example.demo.service.impl.ClienteServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

// Controller tem a responsabilidade de gerir e expor os endpoist da API
// @RequestMapping("/cliente") define a rota de controle para que possamos chamar os endipoints da API

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @Autowired
    private ModelMapper modelMapper;

    // O metodo post esta sendo utilizado para slavar um cliente.

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        return clienteServiceImpl.salvar(cliente);
    }

    // O metodo get esta sendo utilizado para chamar todos os clientes cadastrados e possui uma opcao de filtragem de clientes por entidades.

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> listaCliente(ClienteFiltro clienteFiltro){
        return clienteServiceImpl.listaCliente(clienteFiltro);
    }

    // O metodo get abaixo puxa clientes por Numero de Conta

    @GetMapping("/{numconta}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente buscarClientePorNumConta(@PathVariable("numconta")String numconta) {
            return clienteServiceImpl.buscarPorNumConta(numconta)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente nao encontrado"));
    }

    // O metodo get abaixo exclui os clientes por Numero de Conta

    @DeleteMapping("/{numconta}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerClientePorNumConta(@PathVariable("numconta")String numconta){
        clienteServiceImpl.buscarPorNumConta(numconta)
                .map(cliente -> {
                    clienteServiceImpl.removerPorNumConta(cliente.getNumconta());
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente nao encontrado"));
    }

}
