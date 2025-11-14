package edu.rico.rest.Biblioteca.service.interfaces;

import java.util.List;

import edu.rico.rest.Biblioteca.model.Autor;

public interface IAutorService {
    public List<Autor> getAutores();
    public Autor getAutorById(Long id);
    public Autor guardarOActualizarAutor(Autor autor);
    public Autor deleteAutor(Long id);
}
