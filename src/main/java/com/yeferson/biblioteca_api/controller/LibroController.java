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
}
