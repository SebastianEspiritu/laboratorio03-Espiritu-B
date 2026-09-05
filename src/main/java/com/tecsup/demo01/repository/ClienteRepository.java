package com.tecsup.demo01.repository;

import com.tecsup.demo01.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}