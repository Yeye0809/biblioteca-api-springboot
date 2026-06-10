package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.AutorResponseDTO;
import com.yeferson.biblioteca_api.DTO.LibroRequestDTO;
import com.yeferson.biblioteca_api.DTO.LibroResponseDTO;

import java.util.List;

public interface LibroService {

    LibroResponseDTO saveLibro(LibroRequestDTO dto);
    List<LibroResponseDTO> getLibros();
}
