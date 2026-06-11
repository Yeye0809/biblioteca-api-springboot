package com.yeferson.biblioteca_api.controller;

import com.yeferson.biblioteca_api.DTO.UsuarioRequestDTO;
import com.yeferson.biblioteca_api.DTO.UsuarioResponseDTO;
import com.yeferson.biblioteca_api.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> getUsuarios(){
        return ResponseEntity.ok(usuarioService.getUsuarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> getUsuarioById(@PathVariable Long id){
        return ResponseEntity.ok(usuarioService.getUsuarioById(id));
    }

}
