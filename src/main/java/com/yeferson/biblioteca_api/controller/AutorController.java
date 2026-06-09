package com.yeferson.biblioteca_api.controller;

import com.yeferson.biblioteca_api.DTO.AutorRequestDTO;
import com.yeferson.biblioteca_api.DTO.AutorResponseDTO;
import com.yeferson.biblioteca_api.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/autor")
public class AutorController {
    AutorService autorService;

    public AutorController(AutorService autorService){
        this.autorService =  autorService;
    }

    @PostMapping
    public ResponseEntity<AutorResponseDTO> saveAutor(@RequestBody AutorRequestDTO dto){
        return ResponseEntity.ok(autorService.saveAutor(dto));
    }
}
