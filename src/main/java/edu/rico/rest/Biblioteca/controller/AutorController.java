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
import edu.rico.rest.Biblioteca.service.interfaces.IAutorService;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private IAutorService autorService;

    @GetMapping
    public List<Autor> listarAutores(){
        return autorService.getAutores();
    }

    @GetMapping("/{id}")
    public Autor conseguirAutorPorId(@PathVariable("id") Long id){
        return autorService.getAutorById(id);
    }

    @PostMapping("/save")
    public Autor guardarAutor(@RequestBody Autor autor){
        return autorService.guardarOActualizarAutor(autor);
    }

    @DeleteMapping("/eliminar/{id}")
    public Autor eliminarAutor(@PathVariable("id") Long id){
        return autorService.deleteAutor(id);

    }



}
