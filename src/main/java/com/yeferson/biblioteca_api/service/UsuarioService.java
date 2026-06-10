package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.UsuarioRequestDTO;
import com.yeferson.biblioteca_api.DTO.UsuarioResponseDTO;

public interface UsuarioService {

    UsuarioResponseDTO saveUsaurio(UsuarioRequestDTO dto);
}
