package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.AutorRequestDTO;
import com.yeferson.biblioteca_api.DTO.AutorResponseDTO;

import java.util.List;

public interface AutorService {

    AutorResponseDTO saveAutor(AutorRequestDTO dto);
    List<AutorResponseDTO> getAutores();
    AutorResponseDTO updateAutor(Long id, AutorRequestDTO dto);
}
