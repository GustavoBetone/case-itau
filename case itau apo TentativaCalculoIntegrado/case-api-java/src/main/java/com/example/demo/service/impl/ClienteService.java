package com.example.demo.service.impl;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteService {


    public Cliente salvar(Cliente cliente);

    public List<Cliente> listaCliente();

    public Optional<Cliente> buscarPorNumConta(String numconta);

    public void removerPorNumConta(String numconta);


}
