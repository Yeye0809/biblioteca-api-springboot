package com.yeferson.biblioteca_api.service;

import com.yeferson.biblioteca_api.DTO.PrestamoRequestDTO;
import com.yeferson.biblioteca_api.DTO.PrestamoResponseDTO;
import com.yeferson.biblioteca_api.entity.Libro;
import com.yeferson.biblioteca_api.entity.Prestamo;
import com.yeferson.biblioteca_api.entity.Usuario;
import com.yeferson.biblioteca_api.enums.EstadoLibro;
import com.yeferson.biblioteca_api.enums.EstadoPrestamo;
import com.yeferson.biblioteca_api.mapper.PrestamoMapper;
import com.yeferson.biblioteca_api.repository.LibroRepository;
import com.yeferson.biblioteca_api.repository.PrestamoRepository;
import com.yeferson.biblioteca_api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrestamoServiceImpl implements PrestamoService{

    private PrestamoRepository prestamoRepository;
    private LibroRepository libroRepository;
    private UsuarioRepository usuarioRepository;

    public PrestamoServiceImpl( PrestamoRepository prestamoRepository, LibroRepository libroRepository, UsuarioRepository usuarioRepository){
        this.prestamoRepository = prestamoRepository;
        this.libroRepository = libroRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public PrestamoResponseDTO savePrestamo(PrestamoRequestDTO dto){

        Libro libro = libroRepository.findById(dto.getLibroId()).orElseThrow(()-> new RuntimeException("Libro no encontrado"));
        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId()).orElseThrow(()-> new RuntimeException("usuario no encontrado"));

        if( libro.getEstado() == EstadoLibro.PRESTADO){
            throw new RuntimeException("El libro no se encuentra disponible");
        }

        Prestamo prestamo = new Prestamo();
        prestamo.setFechaPrestamo(LocalDate.now());
        prestamo.setLibro(libro);
        prestamo.setUsuario(usuario);
        prestamo.setEstado(EstadoPrestamo.ACTIVO);
        libro.setEstado(EstadoLibro.PRESTADO);

        Prestamo prestamoSave = prestamoRepository.save(prestamo);

        return PrestamoMapper.toDto(prestamoSave);
    }

    @Override
    public List<PrestamoResponseDTO> getPrestamos(){
        return prestamoRepository.findAll().stream().map(PrestamoMapper::toDto).toList();
    }

    @Override
    public void devolverLibro(Long id){
        Prestamo prestamo = prestamoRepository.findById(id).orElseThrow(()-> new RuntimeException("prestamo no encontrado"));
        prestamo.setEstado(EstadoPrestamo.DEVUELTO);
        Libro libro = prestamo.getLibro();
        libro.setEstado(EstadoLibro.DISPONIBLE);

    }
}
