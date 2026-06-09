package com.yeferson.biblioteca_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autores")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String nombre;
}
