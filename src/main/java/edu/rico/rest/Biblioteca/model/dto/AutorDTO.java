package edu.rico.rest.Biblioteca.model.dto;

import java.util.List;

public record AutorDTO(
    String nombre,
    String apellido1,
    String apellido2,
    String nacionalidad,
    int dniNumero,
    char dniLetra,
    int nacimientoDia,
    int nacimientoMes,
    int nacimientoAnho,
    List<Long> libroIds
) {}
