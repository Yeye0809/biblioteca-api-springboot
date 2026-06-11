package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.UsuarioRequestDTO;
import com.yeferson.biblioteca_api.DTO.UsuarioResponseDTO;

import java.util.List;

public interface UsuarioService {

    UsuarioResponseDTO saveUsaurio(UsuarioRequestDTO dto);
    List<UsuarioResponseDTO> getUsuarios();
    UsuarioResponseDTO getUsuarioById(Long id);
}
