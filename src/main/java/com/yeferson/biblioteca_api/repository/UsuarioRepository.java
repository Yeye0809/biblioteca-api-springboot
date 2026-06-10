package com.yeferson.biblioteca_api.repository;

import com.yeferson.biblioteca_api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
