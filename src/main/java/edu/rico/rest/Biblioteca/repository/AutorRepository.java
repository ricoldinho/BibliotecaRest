package edu.rico.rest.Biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.rico.rest.Biblioteca.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

}
