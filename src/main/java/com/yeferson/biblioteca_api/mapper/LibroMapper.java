package com.yeferson.biblioteca_api.mapper;

import com.yeferson.biblioteca_api.DTO.LibroResponseDTO;
import com.yeferson.biblioteca_api.entity.Libro;

public class LibroMapper {

    public static LibroResponseDTO toDto( Libro libro ){
        LibroResponseDTO dto = new LibroResponseDTO();
        dto.setId(libro.getId());
        dto.setTitulo(libro.getTitulo());
        dto.setEstado(libro.getEstado());
        dto.setAutor(libro.getAutor().getNombre());
        dto.setCategoria(libro.getCategoria().getNombre());
        dto.setAnioPublicacion(libro.getAnioPublicacion());

        return dto;
    }

}
