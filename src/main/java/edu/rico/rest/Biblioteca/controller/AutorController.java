package edu.rico.rest.Biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.rico.rest.Biblioteca.model.Autor;
import edu.rico.rest.Biblioteca.model.dto.AutorDTO;
import edu.rico.rest.Biblioteca.mapper.AutorMapper;
import edu.rico.rest.Biblioteca.service.interfaces.IAutorService;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private IAutorService autorService;

    @Autowired
    private AutorMapper autorMapper;

    @GetMapping
    public List<AutorDTO> listarAutores(){
        return autorService.getAutores().stream().map(autorMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public AutorDTO conseguirAutorPorId(@PathVariable("id") Long id){
        return autorMapper.toDto(autorService.getAutorById(id));
    }

    @PostMapping("/save")
    public AutorDTO guardarAutor(@RequestBody AutorDTO autorDto){
        Autor autor = autorMapper.toEntity(autorDto);
        Autor saved = autorService.guardarOActualizarAutor(autor);
        return autorMapper.toDto(saved);
    }

    @DeleteMapping("/eliminar/{id}")
    public AutorDTO eliminarAutor(@PathVariable("id") Long id){
        Autor deleted = autorService.deleteAutor(id);
        return autorMapper.toDto(deleted);

    }


}
