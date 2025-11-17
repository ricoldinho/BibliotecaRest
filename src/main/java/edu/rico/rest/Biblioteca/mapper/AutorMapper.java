package edu.rico.rest.Biblioteca.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import edu.rico.rest.Biblioteca.model.Autor;
import edu.rico.rest.Biblioteca.model.Libro;
import edu.rico.rest.Biblioteca.model.dto.AutorDTO;
import edu.rico.rest.Biblioteca.model.vo.Dni;
import edu.rico.rest.Biblioteca.model.vo.FechaNacimiento;

@Component
public class AutorMapper {

    public AutorDTO toDto(Autor autor) {
        if (autor == null) return null;
        List<Long> libroIds = null;
        if (autor.getLibros() != null) {
            libroIds = autor.getLibros().stream().map(Libro::getId).collect(Collectors.toList());
        }

        int dniNumero = 0;
        char dniLetra = '\0';
        if (autor.getDni() != null) {
            if (autor.getDni().getNumero() != null) dniNumero = autor.getDni().getNumero();
            if (autor.getDni().getLetra() != null) dniLetra = autor.getDni().getLetra();
        }

        int dia = 0, mes = 0, anho = 0;
        if (autor.getFechaNacimiento() != null) {
            if (autor.getFechaNacimiento().getDia() != null) dia = autor.getFechaNacimiento().getDia();
            if (autor.getFechaNacimiento().getMes() != null) mes = autor.getFechaNacimiento().getMes();
            if (autor.getFechaNacimiento().getAnho() != null) anho = autor.getFechaNacimiento().getAnho();
        }

        return new AutorDTO(
            autor.getNombre(),
            autor.getApellido1(),
            autor.getApellido2(),
            autor.getNacionalidad(),
            dniNumero,
            dniLetra,
            dia,
            mes,
            anho,
            libroIds
        );
    }

    public Autor toEntity(AutorDTO dto) {
        if (dto == null) return null;
        Autor autor = new Autor();
        // Do not set the id here; JPA will handle it
        autor.setNombre(dto.nombre());
        autor.setApellido1(dto.apellido1());
        autor.setApellido2(dto.apellido2());
        autor.setNacionalidad(dto.nacionalidad());

        // Map DNI if provided
        if (dto.dniNumero() > 0 && dto.dniLetra() != '\0') {
            Dni dni = new Dni(dto.dniNumero(), dto.dniLetra());
            autor.setDni(dni);
        }

        // Map FechaNacimiento if provided
        if (dto.nacimientoDia() > 0 && dto.nacimientoMes() > 0 && dto.nacimientoAnho() > 0) {
            FechaNacimiento fn = new FechaNacimiento(dto.nacimientoDia(), dto.nacimientoMes(), dto.nacimientoAnho());
            autor.setFechaNacimiento(fn);
        }

        return autor;
    }
}
