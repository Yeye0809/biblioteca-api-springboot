package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.PrestamoRequestDTO;
import com.yeferson.biblioteca_api.DTO.PrestamoResponseDTO;

public interface PrestamoService {

    PrestamoResponseDTO savePrestamo(PrestamoRequestDTO dto);
}
