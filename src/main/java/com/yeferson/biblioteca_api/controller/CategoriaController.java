package com.yeferson.biblioteca_api.controller;

import com.yeferson.biblioteca_api.DTO.CategoriaRequestDTO;
import com.yeferson.biblioteca_api.DTO.CategoriaResponseDTO;
import com.yeferson.biblioteca_api.service.CategoriaService;
import com.yeferson.biblioteca_api.service.CategoriaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController( CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public ResponseEntity<CategoriaResponseDTO> saveCategoria(@RequestBody CategoriaRequestDTO dto){
        return ResponseEntity.ok(categoriaService.saveCategoria(dto));
    }
}
