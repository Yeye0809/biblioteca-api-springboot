package com.yeferson.biblioteca_api.entity;

import com.yeferson.biblioteca_api.enums.EstadoLibro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String titulo;

    private Integer anioPublicacion;

    @Enumerated(EnumType.STRING)
    private EstadoLibro estado;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
