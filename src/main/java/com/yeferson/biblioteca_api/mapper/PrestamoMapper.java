package com.yeferson.biblioteca_api.mapper;

import com.yeferson.biblioteca_api.DTO.PrestamoResponseDTO;
import com.yeferson.biblioteca_api.entity.Prestamo;

public class PrestamoMapper {

    public static PrestamoResponseDTO toDto(Prestamo prestamo){
        PrestamoResponseDTO dto = new PrestamoResponseDTO();
        dto.setId(prestamo.getId());
        dto.setFechaPrestamos(prestamo.getFechaPrestamo());
        dto.setLibro(prestamo.getLibro().getTitulo());
        dto.setUsuario(prestamo.getUsuario().getNombre());
        dto.setEstado(prestamo.getEstado());

        return dto;
    }
}
