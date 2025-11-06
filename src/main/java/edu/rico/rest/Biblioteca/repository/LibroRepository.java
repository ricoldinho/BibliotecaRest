package edu.rico.rest.Biblioteca.repository;

import edu.rico.rest.Biblioteca.model.Isbn;
import edu.rico.rest.Biblioteca.model.Libro;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Esta interfaz es nuestro Repositorio.
 * Le decimos a Spring: "Queremos gestionar la entidad 'Libro', 
 * y su clave primaria (Id) es de tipo 'Long'".
 * * Spring Boot creará automáticamente una implementación de esta interfaz
 * con todos los métodos CRUD (Create, Read, Update, Delete).
 */
@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Aquí podríamos añadir métodos personalizados si los necesitáramos,
    // por ejemplo:
    Optional<Libro> findByIsbn(Isbn isbn);
}