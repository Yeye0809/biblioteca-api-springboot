package com.yeferson.biblioteca_api.repository;

import com.yeferson.biblioteca_api.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> getLibroByCategoriaId(Long id);
}
