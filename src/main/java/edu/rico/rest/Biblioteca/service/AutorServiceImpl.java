package edu.rico.rest.Biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.rico.rest.Biblioteca.model.Autor;
import edu.rico.rest.Biblioteca.repository.AutorRepository;
import edu.rico.rest.Biblioteca.service.interfaces.IAutorService;

@Service
public class AutorServiceImpl implements IAutorService {

    /*
     * private AutorRepository autorRepo;
     * 
     * public AutorServiceImpl(AutorRepository autorRepo){
     *      this.autorRepo = autorRepo;
     * }
     */

    @Autowired
    private AutorRepository autorRepo;

    @Override
    public List<Autor> getAutores() {
        return autorRepo.findAll();
    }

    @Override
    public Autor getAutorById(Long id) {
        Optional<Autor> op = autorRepo.findById(id);

        if(op.isPresent()){
            return op.get();
        }
        return null;
    }

    @Override
    public Autor guardarOActualizarAutor(Autor autor) {
       
        if(autor.getAutor_id() == null){
            System.out.println("GUARDAMOS " + autor + " EN LA BASE DE DATOS");
            return autorRepo.save(autor);
        }else{
            if(autorRepo.existsById(autor.getAutor_id())){
                System.out.println("ACTUALIZAMOS AUTOR " + autor + " EN LA BASE DE DATOS");
                return autorRepo.save(autor);
            }else{
                System.out.println("NO EXISTE ESE AUTOR");
                return null;
            }
        }
    }

    @Override
    public Autor deleteAutor(Long id){
        Autor autorAEliminar = autorRepo.findById(id).orElseThrow();
        autorRepo.deleteById(id);
        return autorAEliminar;
    }

}
