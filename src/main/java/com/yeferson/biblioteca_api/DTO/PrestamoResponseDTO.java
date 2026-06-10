package com.yeferson.biblioteca_api.DTO;

import com.yeferson.biblioteca_api.enums.EstadoPrestamo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrestamoResponseDTO {

    private Long id;
    private String libro;
    private String usuario;
    private EstadoPrestamo estado;
    private LocalDate fechaPrestamos;

}
