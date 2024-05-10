package com.example.demo.repository;

import com.example.demo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//O repository tem a funcao de acessas as entidades do banco de dados.

public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
