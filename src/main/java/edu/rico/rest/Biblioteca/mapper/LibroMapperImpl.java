package edu.rico.rest.Biblioteca.mapper;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.rico.rest.Biblioteca.model.Autor;
import edu.rico.rest.Biblioteca.model.Libro;
import edu.rico.rest.Biblioteca.model.dto.LibroDTO;
import edu.rico.rest.Biblioteca.model.vo.Isbn;
import edu.rico.rest.Biblioteca.model.vo.Money;
import edu.rico.rest.Biblioteca.repository.AutorRepository;

@Component
public class LibroMapperImpl implements ILibroMapper {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Libro toEntity(LibroDTO dto) {
        if (dto == null) {
            return null;
        }

        Libro libro = new Libro();
        libro.setTitulo(dto.titulo());
        libro.setIsbn(new Isbn(dto.isbn()));
        libro.setPrecio(new Money(dto.precio(), dto.moneda()));
        libro.setEditorial(dto.editorial());
        libro.setFechaLanzamiento(dto.fechaLanzamiento());
        libro.setAutores(mapAutores(dto.autorIds()));

        return libro;
    }

    @Override
    public LibroDTO toDto(Libro libro) {
        if (libro == null) {
            return null;
        }

        String isbn = libro.getIsbn() != null ? libro.getIsbn().getValue() : null;
        java.math.BigDecimal precio = libro.getPrecio() != null ? libro.getPrecio().getAmount() : null;
        String moneda = libro.getPrecio() != null ? libro.getPrecio().getCurrency() : null;
        Long[] autorIds = mapAutoresIds(libro.getAutores());

        return new LibroDTO(
            libro.getTitulo(),
            autorIds,
            isbn,
            precio,
            moneda,
            libro.getEditorial(),
            libro.getFechaLanzamiento()
        );
    }

    @Override
    public void updateLibroFromDto(LibroDTO dto, Libro entity) {
        if (dto == null) {
            return;
        }

        entity.setTitulo(dto.titulo());
        entity.setIsbn(new Isbn(dto.isbn()));
        entity.setPrecio(new Money(dto.precio(), dto.moneda()));
        entity.setEditorial(dto.editorial());
        entity.setFechaLanzamiento(dto.fechaLanzamiento());
        entity.setAutores(mapAutores(dto.autorIds()));
    }

    // Métodos auxiliares para mapear autores
    private Set<Autor> mapAutores(Long[] autorIds) {
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

    private Long[] mapAutoresIds(Set<Autor> autores) {
        if (autores == null || autores.isEmpty()) {
            return new Long[0];
        }
        return autores.stream()
                .map(Autor::getAutor_id)
                .toArray(Long[]::new);
    }
}
