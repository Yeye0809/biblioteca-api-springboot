package com.yeferson.biblioteca_api.mapper;

import com.yeferson.biblioteca_api.DTO.AutorResponseDTO;
import com.yeferson.biblioteca_api.entity.Autor;

public class AutorMapper {

    public static AutorResponseDTO toDto(Autor autor){
        AutorResponseDTO dto = new AutorResponseDTO();
        dto.setId(autor.getId());
        dto.setNombre(autor.getNombre());

        return dto;
    }
}
