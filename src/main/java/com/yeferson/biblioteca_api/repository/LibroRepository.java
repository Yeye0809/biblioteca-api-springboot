package com.yeferson.biblioteca_api.repository;

import com.yeferson.biblioteca_api.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
