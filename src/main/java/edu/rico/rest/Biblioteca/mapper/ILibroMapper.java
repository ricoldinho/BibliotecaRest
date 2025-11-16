package edu.rico.rest.Biblioteca.mapper;

import edu.rico.rest.Biblioteca.model.Libro;
import edu.rico.rest.Biblioteca.model.dto.LibroDTO;

public interface ILibroMapper {
    Libro toEntity(LibroDTO dto);
    LibroDTO toDto(Libro libro);
    void updateLibroFromDto(LibroDTO dto, Libro entity);
}
