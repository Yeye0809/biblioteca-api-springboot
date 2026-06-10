package com.yeferson.biblioteca_api.controller;

import com.yeferson.biblioteca_api.DTO.PrestamoRequestDTO;
import com.yeferson.biblioteca_api.DTO.PrestamoResponseDTO;
import com.yeferson.biblioteca_api.service.PrestamoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    PrestamoService prestamoService;

    public PrestamoController(PrestamoService prestamoService){
        this.prestamoService = prestamoService;
    }

    @PostMapping
    public ResponseEntity<PrestamoResponseDTO> savePrestamo(@RequestBody PrestamoRequestDTO dto){
        return ResponseEntity.ok(prestamoService.savePrestamo(dto));
    }
}
