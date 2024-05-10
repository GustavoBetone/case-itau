package com.example.demo.repository;

import com.example.demo.entity.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransferenciaRepository extends JpaRepository<Transferencia, String> {
}
