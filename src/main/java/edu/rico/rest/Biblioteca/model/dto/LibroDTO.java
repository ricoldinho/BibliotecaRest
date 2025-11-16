package edu.rico.rest.Biblioteca.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Este es un DTO (Data Transfer Object) usado como "formulario"
 * para crear un nuevo libro.
 * Fíjate que aquí recibimos los datos "crudos" (String, BigDecimal),
 * no nuestros Value Objects.
 */
public record LibroDTO(
    String titulo,
    Long[] autorIds, // Array de IDs de autores
    String isbn, // El ISBN como un simple String
    BigDecimal precio, // El precio como un número
    String moneda, // La moneda como un String
    String editorial,
    LocalDate fechaLanzamiento
) {}