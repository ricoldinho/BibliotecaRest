package edu.rico.rest.Biblioteca.service.interfaces;

import java.util.List;
import java.util.Optional;

import edu.rico.rest.Biblioteca.model.Libro;
import edu.rico.rest.Biblioteca.model.dto.LibroDTO;

public interface ILibroService {
    Libro crearLibro(LibroDTO dto);
    Optional<Libro> obtenerLibroPorId(Long id);
    List<Libro> obtenerTodosLosLibros();
    Libro actualizarLibro(Long id, LibroDTO dto);
    void borrarLibro(Long id);

}
