package edu.rico.rest.Biblioteca.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

import edu.rico.rest.Biblioteca.model.Libro;
import edu.rico.rest.Biblioteca.model.dto.LibroDTO;
import edu.rico.rest.Biblioteca.model.vo.Isbn;
import edu.rico.rest.Biblioteca.model.vo.Money;

@Component
@Mapper(componentModel = "spring")
public interface LibroMapper {

    @Mapping(target = "isbn", expression = "java(new Isbn(dto.isbn()))")
    @Mapping(target = "precio", expression = "java(new Money(dto.precio(), dto.moneda()))")
    Libro toEntity(LibroDTO dto);

    @Mapping(source = "isbn.value", target = "isbn")
    @Mapping(source = "precio.amount", target = "precio")
    @Mapping(source = "precio.currency", target = "moneda")
    LibroDTO toDto(Libro libro);

    @Mapping(target = "isbn", expression = "java(new Isbn(dto.isbn()))")
    @Mapping(target = "precio", expression = "java(new Money(dto.precio(), dto.moneda()))")
    void updateLibroFromDto(LibroDTO dto, @MappingTarget Libro entity);
}
