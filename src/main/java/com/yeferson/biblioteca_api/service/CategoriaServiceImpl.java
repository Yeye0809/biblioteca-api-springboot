package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.CategoriaRequestDTO;
import com.yeferson.biblioteca_api.DTO.CategoriaResponseDTO;
import com.yeferson.biblioteca_api.entity.Categoria;
import com.yeferson.biblioteca_api.mapper.CategoriaMapper;
import com.yeferson.biblioteca_api.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl  implements CategoriaService{

    CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public CategoriaResponseDTO saveCategoria(CategoriaRequestDTO dto){
        Categoria categoria = new Categoria();
        categoria.setNombre(dto.getNombre());
        Categoria categoriaSave = categoriaRepository.save(categoria);

        return CategoriaMapper.toDto(categoriaSave);
    }


}
