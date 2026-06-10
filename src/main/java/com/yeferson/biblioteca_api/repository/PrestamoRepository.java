package com.yeferson.biblioteca_api.repository;

import com.yeferson.biblioteca_api.entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
