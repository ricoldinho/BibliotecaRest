package edu.rico.rest.Biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rico.rest.Biblioteca.mapper.LibroMapper;
import edu.rico.rest.Biblioteca.model.Libro;
import edu.rico.rest.Biblioteca.model.dto.LibroDTO;
import edu.rico.rest.Biblioteca.repository.LibroRepository;
import edu.rico.rest.Biblioteca.service.interfaces.ILibroService;

@Service // Le dice a Spring que esta es una clase de Servicio
public class LibroServiceImpl implements ILibroService {

    private final LibroRepository libroRepository;
    private final LibroMapper libroMapper;

    public LibroServiceImpl(LibroRepository libroRepository, LibroMapper libroMapper) {
        this.libroRepository = libroRepository;
        this.libroMapper = libroMapper;
    }

    @Override
    @Transactional
    public Libro crearLibro(LibroDTO dto) {
        try {
            Libro libro = libroMapper.toEntity(dto);            // Validar que el ISBN no exista ya
            if (libroRepository.findByIsbn(libro.getIsbn()).isPresent()) {
                throw new IllegalArgumentException("Ya existe un libro con el ISBN: " + dto.isbn());
            }

            return libroRepository.save(libro);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Datos del libro inválidos: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libroRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.findAll();
    }

    @Override
    @Transactional
    public Libro actualizarLibro(Long id, LibroDTO dto) {
        try {
            Libro libroExistente = libroRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Libro no encontrado con id " + id));

            libroMapper.updateLibroFromDto(dto, libroExistente);

            return libroRepository.save(libroExistente);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Datos del libro inválidos: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public void borrarLibro(Long id) {
        if (libroRepository.existsById(id)) {
            libroRepository.deleteById(id);
        } else {
            throw new RuntimeException("Libro no encontrado con id " + id);
        }
    }
}