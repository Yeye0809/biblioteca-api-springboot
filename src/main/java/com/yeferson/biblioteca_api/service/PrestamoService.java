package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.PrestamoRequestDTO;
import com.yeferson.biblioteca_api.DTO.PrestamoResponseDTO;

import java.util.List;

public interface PrestamoService {

    PrestamoResponseDTO savePrestamo(PrestamoRequestDTO dto);
    List<PrestamoResponseDTO> getPrestamos();
    void devolverLibro(Long id);
}
