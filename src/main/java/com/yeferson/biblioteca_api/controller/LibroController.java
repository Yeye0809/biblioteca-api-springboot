package com.yeferson.biblioteca_api.controller;

import com.yeferson.biblioteca_api.DTO.LibroRequestDTO;
import com.yeferson.biblioteca_api.DTO.LibroResponseDTO;
import com.yeferson.biblioteca_api.service.LibroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    LibroService libroService;

    public LibroController(LibroService libroService){
        this.libroService = libroService;
    }

    @PostMapping
    public ResponseEntity<LibroResponseDTO> saveLibro(@RequestBody LibroRequestDTO dto){
        return ResponseEntity.ok(libroService.saveLibro(dto));
    }

    @GetMapping
    public ResponseEntity<List<LibroResponseDTO>> getLibros(){
        return ResponseEntity.ok(libroService.getLibros());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibroResponseDTO> getLibroById(@PathVariable Long id){
        return ResponseEntity.ok(libroService.getLibroById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LibroResponseDTO> updateLibro(@PathVariable Long id, @RequestBody LibroRequestDTO dto){
        return ResponseEntity.ok(libroService.updateLibro(id, dto));
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<LibroResponseDTO>> getLibroByCategoriaId(@PathVariable Long id){
        return ResponseEntity.ok(libroService.getLibroByCategoriaId(id));
    }
}
