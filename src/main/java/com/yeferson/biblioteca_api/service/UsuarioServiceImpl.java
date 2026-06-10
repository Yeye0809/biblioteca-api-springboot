package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.UsuarioRequestDTO;
import com.yeferson.biblioteca_api.DTO.UsuarioResponseDTO;
import com.yeferson.biblioteca_api.entity.Usuario;
import com.yeferson.biblioteca_api.mapper.UsuarioMapper;
import com.yeferson.biblioteca_api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioResponseDTO saveUsaurio(UsuarioRequestDTO dto){
        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setTelefono(dto.getTelefono());

        Usuario usuarioSave = usuarioRepository.save(usuario);

        return UsuarioMapper.toDto(usuarioSave);
    }
}
