package com.yeferson.biblioteca_api.DTO;

import com.yeferson.biblioteca_api.enums.EstadoLibro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibroResponseDTO {
    private Long id;

    private String titulo;

    private Integer anioPublicacion;

    private EstadoLibro estado;

    private String autor;

    private String categoria;
}
