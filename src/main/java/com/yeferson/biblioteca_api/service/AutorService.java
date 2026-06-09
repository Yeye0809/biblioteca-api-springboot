package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.AutorRequestDTO;
import com.yeferson.biblioteca_api.DTO.AutorResponseDTO;

public interface AutorService {

    AutorResponseDTO saveAutor(AutorRequestDTO dto);
}
