package com.tecsup.demo01.repository;

import com.tecsup.demo01.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {}