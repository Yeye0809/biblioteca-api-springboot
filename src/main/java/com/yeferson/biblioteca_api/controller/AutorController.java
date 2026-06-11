package com.yeferson.biblioteca_api.controller;

import com.yeferson.biblioteca_api.DTO.AutorRequestDTO;
import com.yeferson.biblioteca_api.DTO.AutorResponseDTO;
import com.yeferson.biblioteca_api.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
    AutorService autorService;

    public AutorController(AutorService autorService){
        this.autorService =  autorService;
    }

    @PostMapping
    public ResponseEntity<AutorResponseDTO> saveAutor(@RequestBody AutorRequestDTO dto){
        return ResponseEntity.ok(autorService.saveAutor(dto));
    }
    @GetMapping
    public ResponseEntity<List<AutorResponseDTO>> getAutores(){
        return ResponseEntity.ok(autorService.getAutores());
    }

    @PutMapping("/{id}")
    public ResponseEntity<AutorResponseDTO> updateAutor(@PathVariable Long id, @RequestBody AutorRequestDTO dto){
        return ResponseEntity.ok(autorService.updateAutor(id, dto));
    }
}
