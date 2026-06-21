package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.AutorResponseDTO;
import com.yeferson.biblioteca_api.DTO.LibroRequestDTO;
import com.yeferson.biblioteca_api.DTO.LibroResponseDTO;
import com.yeferson.biblioteca_api.entity.Autor;
import com.yeferson.biblioteca_api.entity.Categoria;
import com.yeferson.biblioteca_api.entity.Libro;
import com.yeferson.biblioteca_api.enums.EstadoLibro;
import com.yeferson.biblioteca_api.exception.LibroNoEncontrado;
import com.yeferson.biblioteca_api.mapper.LibroMapper;
import com.yeferson.biblioteca_api.repository.AutorRepository;
import com.yeferson.biblioteca_api.repository.CategoriaRepository;
import com.yeferson.biblioteca_api.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService{

    LibroRepository libroRepository;
    AutorRepository autorRepository;
    CategoriaRepository categoriaRepository;

    public LibroServiceImpl(LibroRepository libroRepository, AutorRepository autorRepository, CategoriaRepository categoriaRepository){
        this.libroRepository = libroRepository;
        this.autorRepository = autorRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public LibroResponseDTO saveLibro(LibroRequestDTO dto){
        Autor autor = autorRepository.findById(dto.getAutorId()).orElseThrow(()-> new RuntimeException("El autor no existe"));
        Categoria categoria = categoriaRepository.findById(dto.getCategoriaId()).orElseThrow(()-> new RuntimeException("La categoria no existe"));
        Libro libro = new Libro();
        libro.setAutor(autor);
        libro.setTitulo(dto.getTitulo());
        libro.setEstado(EstadoLibro.DISPONIBLE);
        libro.setCategoria(categoria);
        libro.setAnioPublicacion(dto.getAnioPublicacion());

        Libro libroSave = libroRepository.save(libro);

        return LibroMapper.toDto(libroSave);

    }

    @Override
    public List<LibroResponseDTO> getLibros(){
        return libroRepository.findAll().stream().map(LibroMapper::toDto).toList();
    }

    @Override
    public LibroResponseDTO getLibroById(Long id){
        Libro libro = libroRepository.findById(id).orElseThrow(()-> new LibroNoEncontrado("Libro con el Id " + id + " no encontrado"));

        return LibroMapper.toDto(libro);
    }

    @Override
    public LibroResponseDTO updateLibro(Long id, LibroRequestDTO dto){
        Autor autor = autorRepository.findById(dto.getAutorId()).orElseThrow(()-> new RuntimeException("Autor no encontrado"));
        Categoria categoria = categoriaRepository.findById(dto.getCategoriaId()).orElseThrow(()-> new RuntimeException("categoria no encontrada"));
        Libro libro = libroRepository.findById(id).orElseThrow(()-> new RuntimeException("Libro no encontrado"));
        libro.setTitulo(dto.getTitulo());
        libro.setAnioPublicacion(dto.getAnioPublicacion());
        libro.setAutor(autor);
        libro.setCategoria(categoria);

        Libro libroUpdate = libroRepository.save(libro);

        return LibroMapper.toDto(libroUpdate);
    }

    @Override
    public List<LibroResponseDTO> getLibroByCategoriaId(Long id){
        return libroRepository.getLibroByCategoriaId(id).stream().map(LibroMapper::toDto).toList();
    }
}
