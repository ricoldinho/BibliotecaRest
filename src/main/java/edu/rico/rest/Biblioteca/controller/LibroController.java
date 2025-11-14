package edu.rico.rest.Biblioteca.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import edu.rico.rest.Biblioteca.mapper.LibroMapper;
import edu.rico.rest.Biblioteca.model.Libro;
import edu.rico.rest.Biblioteca.model.dto.LibroDTO;
import edu.rico.rest.Biblioteca.service.interfaces.ILibroService;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final ILibroService libroService;
    private final LibroMapper libroMapper;

    public LibroController(ILibroService libroService, LibroMapper libroMapper) {
        this.libroService = libroService;
        this.libroMapper = libroMapper;
    }

    @GetMapping
    public List<LibroDTO> getAll() {
        return libroService.obtenerTodosLosLibros().stream()
                .map(libroMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibroDTO> getById(@PathVariable Long id) {
        return libroService.obtenerLibroPorId(id)
                .map(libroMapper::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<LibroDTO> create(@RequestBody LibroDTO libroDTO, UriComponentsBuilder ucb) {
        Libro nuevoLibro = libroService.crearLibro(libroDTO);
        LibroDTO nuevoLibroDTO = libroMapper.toDto(nuevoLibro);

        URI location = ucb.path("/api/libros/{id}").buildAndExpand(nuevoLibro.getId()).toUri();

        return ResponseEntity.created(location).body(nuevoLibroDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LibroDTO> update(@PathVariable Long id, @RequestBody LibroDTO libroDTO) {
        Libro libroActualizado = libroService.actualizarLibro(id, libroDTO);
        return ResponseEntity.ok(libroMapper.toDto(libroActualizado));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        libroService.borrarLibro(id);
    }
}
