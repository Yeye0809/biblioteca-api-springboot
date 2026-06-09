package com.yeferson.biblioteca_api.repository;

import com.yeferson.biblioteca_api.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
