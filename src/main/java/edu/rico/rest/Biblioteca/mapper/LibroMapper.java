package edu.rico.rest.Biblioteca.mapper;

import java.util.HashSet;
import java.util.Set;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import edu.rico.rest.Biblioteca.model.Autor;
import edu.rico.rest.Biblioteca.model.Libro;
import edu.rico.rest.Biblioteca.model.dto.LibroDTO;
import edu.rico.rest.Biblioteca.repository.AutorRepository;

// MapStruct mapper removed: using manual `ILibroMapper` / `LibroMapperImpl` implementation instead
public abstract class LibroMapper {

    protected AutorRepository autorRepository;

    public void setAutorRepository(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isbn", expression = "java(new edu.rico.rest.Biblioteca.model.vo.Isbn(dto.isbn()))")
    @Mapping(target = "precio", expression = "java(new edu.rico.rest.Biblioteca.model.vo.Money(dto.precio(), dto.moneda()))")
    @Mapping(target = "autores", expression = "java(mapAutores(dto.autorIds()))")
    public abstract Libro toEntity(LibroDTO dto);

    @Mapping(source = "isbn.value", target = "isbn")
    @Mapping(source = "precio.amount", target = "precio")
    @Mapping(source = "precio.currency", target = "moneda")
    @Mapping(target = "autorIds", expression = "java(mapAutoresIds(libro.getAutores()))")
    public abstract LibroDTO toDto(Libro libro);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isbn", expression = "java(new edu.rico.rest.Biblioteca.model.vo.Isbn(dto.isbn()))")
    @Mapping(target = "precio", expression = "java(new edu.rico.rest.Biblioteca.model.vo.Money(dto.precio(), dto.moneda()))")
    @Mapping(target = "autores", expression = "java(mapAutores(dto.autorIds()))")
    public abstract void updateLibroFromDto(LibroDTO dto, @MappingTarget Libro entity);

    // Métodos auxiliares para mapear autores
    protected Set<Autor> mapAutores(Long[] autorIds) {
        Set<Autor> autores = new HashSet<>();
        if (autorIds != null) {
            for (Long id : autorIds) {
                if (id != null) {
                    autorRepository.findById(id).ifPresent(autores::add);
                }
            }
        }
        return autores;
    }

    protected Long[] mapAutoresIds(Set<Autor> autores) {
        if (autores == null || autores.isEmpty()) {
            return new Long[0];
        }
        return autores.stream()
                .map(Autor::getAutor_id)
                .toArray(Long[]::new);
    }
}
