package com.yeferson.biblioteca_api.mapper;

import com.yeferson.biblioteca_api.DTO.UsuarioResponseDTO;
import com.yeferson.biblioteca_api.entity.Usuario;

public class UsuarioMapper {

    public static UsuarioResponseDTO toDto(Usuario usuario){
        UsuarioResponseDTO dto = new UsuarioResponseDTO();
        dto.setId(usuario.getId());
        dto.setNombre(usuario.getNombre());
        dto.setTelefono(usuario.getTelefono());

        return dto;
    }
}
