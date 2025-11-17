package edu.rico.rest.Biblioteca.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import edu.rico.rest.Biblioteca.model.vo.Dni;
import edu.rico.rest.Biblioteca.model.vo.FechaNacimiento;
@Entity
@Table(name="autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autor_id;
    @Column(length=100, nullable = false)
    private String nombre;
    @Column(length=100, nullable = false)
    private String apellido1;
    @Column(length=100, nullable = true)
    private String apellido2;
    @Column(length=50, nullable = false)
    private String nacionalidad;

    @ManyToMany(mappedBy = "autores")
    private Set<Libro> libros = new HashSet<>();

    @jakarta.persistence.Convert(converter = edu.rico.rest.Biblioteca.model.converter.DniAttributeConverter.class)
    @Column(name = "dni")
    private Dni dni;

    @jakarta.persistence.Convert(converter = edu.rico.rest.Biblioteca.model.converter.FechaNacimientoAttributeConverter.class)
    @Column(name = "fecha_nacimiento")
    private FechaNacimiento fechaNacimiento;

    public Autor(){}

    public Autor(Long autor_id, String nombre, String apellido1, String apellido2, String nacionalidad) {
        this.autor_id = autor_id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nacionalidad = nacionalidad;
    }

    public Autor(Long autor_id, String nombre, String apellido1, String apellido2, String nacionalidad, Dni dni, FechaNacimiento fechaNacimiento) {
        this.autor_id = autor_id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nacionalidad = nacionalidad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(Long autor_id) {
        this.autor_id = autor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public FechaNacimiento getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(FechaNacimiento fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Autor [autor_id=" + autor_id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
            + apellido2 + ", nacionalidad=" + nacionalidad + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    

    
}
