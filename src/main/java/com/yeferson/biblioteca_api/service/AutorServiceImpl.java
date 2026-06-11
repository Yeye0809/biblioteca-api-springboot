package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.AutorRequestDTO;
import com.yeferson.biblioteca_api.DTO.AutorResponseDTO;
import com.yeferson.biblioteca_api.entity.Autor;
import com.yeferson.biblioteca_api.mapper.AutorMapper;
import com.yeferson.biblioteca_api.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {

    AutorRepository autorRepository;

    public AutorServiceImpl(AutorRepository autorRepository){
        this.autorRepository = autorRepository;
    }

    @Override
    public AutorResponseDTO saveAutor(AutorRequestDTO dto){
        Autor autor = new Autor();
        autor.setNombre(dto.getNombre());

        Autor autorSave = autorRepository.save(autor);

        return AutorMapper.toDto(autorSave);
    }

    @Override
    public List<AutorResponseDTO> getAutores(){
        return autorRepository.findAll().stream().map(AutorMapper::toDto).toList();
    }

    @Override
    public AutorResponseDTO updateAutor(Long id, AutorRequestDTO dto){
        Autor autor = autorRepository.findById(id).orElseThrow(()-> new RuntimeException("autor no encontrado"));
        autor.setNombre(dto.getNombre());

        Autor autorUpdate = autorRepository.save(autor);

        return AutorMapper.toDto(autorUpdate);
    }

}
