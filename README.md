# 📚 Library API

API REST desarrollada con **Spring Boot** para la gestión de una biblioteca. El proyecto permite administrar autores, categorías, libros, usuarios y préstamos, aplicando relaciones JPA, validaciones y reglas de negocio.

Este proyecto fue desarrollado con fines de aprendizaje para fortalecer conocimientos en **Java, Spring Boot, Spring Data JPA y PostgreSQL**.

---

## 🚀 Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok

---

## 📂 Modelo de datos

El proyecto está compuesto por las siguientes entidades:

- **Autor**
- **Categoría**
- **Libro**
- **Usuario**
- **Préstamo**

### Relaciones

```text
Autor 1 ------ N Libro

Categoría 1 ------ N Libro

Usuario 1 ------ N Préstamo

Libro 1 ------ N Préstamo
```

---

## 📖 Funcionalidades

### Autores

- Crear autor
- Listar autores
- Buscar autor por ID
- Actualizar autor
- Eliminar autor

---

### Categorías

- Crear categoría
- Listar categorías
- Buscar categoría
- Actualizar categoría
- Eliminar categoría

---

### Libros

- Registrar libro
- Consultar libros
- Buscar libro por ID
- Actualizar información
- Eliminar libro
- Filtrar libros por categoría

---

### Usuarios

- Registrar usuario
- Consultar usuarios
- Buscar usuario
- Actualizar usuario
- Eliminar usuario

---

### Préstamos

- Registrar préstamo
- Devolver libro
- Consultar préstamos


---

## 📌 Estados del libro

Cada libro posee un estado para controlar su disponibilidad.

```java
public enum EstadoLibro {

    DISPONIBLE,
    PRESTADO
}
```

---

## 📌 Estados del préstamo

```java
public enum EstadoPrestamo {

    ACTIVO,
    DEVUELTO
}
```

---

## ⚙️ Reglas de negocio

El sistema implementa las siguientes reglas:

- No se puede prestar un libro que ya se encuentre prestado.
- Al crear un préstamo, el libro cambia automáticamente a **PRESTADO**.
- Al devolver un libro, el préstamo cambia a **DEVUELTO**.
- Al devolver un libro, su estado cambia automáticamente a **DISPONIBLE**.
- Solo pueden realizarse préstamos de libros existentes.
- Solo usuarios registrados pueden solicitar préstamos.

---

```text
src
│
├── controller
├── dto
├── entity
├── enums
├── exception
├── repository
├── service
└── config
```

---

## 🛠️ Próximas mejoras

- Documentación con Swagger/OpenAPI.
- Manejo global de excepciones.
- DTO de respuesta para todas las entidades.
- Paginación y ordenamiento.
- Búsqueda por título del libro.
- Filtro por autor.
- Validaciones avanzadas.
- Autenticación con Spring Security y JWT.

---

## 🎯 Objetivo del proyecto

Este proyecto fue desarrollado como práctica para fortalecer conocimientos en:

- Relaciones JPA (`@ManyToOne`, `@OneToMany`)
- Arquitectura por capas
- Diseño de APIs REST
- DTOs
- Reglas de negocio
- Persistencia de datos con PostgreSQL
- Buenas prácticas en Spring Boot

---

## 👨‍💻 Autor

**Yeferson Andrés Hernández**

Proyecto desarrollado como parte de mi proceso de aprendizaje autodidacta en desarrollo backend con Java y Spring Boot.