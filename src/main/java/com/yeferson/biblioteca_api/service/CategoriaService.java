package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.CategoriaRequestDTO;
import com.yeferson.biblioteca_api.DTO.CategoriaResponseDTO;

public interface CategoriaService {

    CategoriaResponseDTO saveCategoria(CategoriaRequestDTO dto);
}
