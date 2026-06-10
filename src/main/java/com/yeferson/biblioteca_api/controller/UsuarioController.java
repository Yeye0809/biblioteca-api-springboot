package com.yeferson.biblioteca_api.controller;

import com.yeferson.biblioteca_api.DTO.UsuarioRequestDTO;
import com.yeferson.biblioteca_api.DTO.UsuarioResponseDTO;
import com.yeferson.biblioteca_api.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> saveUsuario(@RequestBody UsuarioRequestDTO dto){
        return ResponseEntity.ok(usuarioService.saveUsaurio(dto));
    }
}
