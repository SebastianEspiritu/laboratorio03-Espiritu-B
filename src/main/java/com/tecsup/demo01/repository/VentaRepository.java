package com.tecsup.demo01.repository;

import com.tecsup.demo01.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {}