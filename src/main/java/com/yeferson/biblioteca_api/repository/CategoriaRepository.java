package com.yeferson.biblioteca_api.repository;

import com.yeferson.biblioteca_api.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
