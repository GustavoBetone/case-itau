package com.example.demo.service.impl;


import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorNumConta(String numconta){
        return clienteRepository.findById(numconta);
    }

    public void removerPorNumConta(String numconta){
        clienteRepository.deleteById(numconta);
    }


}

