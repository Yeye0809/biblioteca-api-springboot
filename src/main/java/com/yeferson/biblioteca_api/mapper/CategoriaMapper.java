package com.yeferson.biblioteca_api.mapper;

import com.yeferson.biblioteca_api.DTO.CategoriaResponseDTO;
import com.yeferson.biblioteca_api.entity.Categoria;

public class CategoriaMapper {

    public static CategoriaResponseDTO toDto(Categoria categoria){
        CategoriaResponseDTO dto = new CategoriaResponseDTO();
        dto.setId(categoria.getId());
        dto.setNombre(categoria.getNombre());

        return dto;
    }

}
