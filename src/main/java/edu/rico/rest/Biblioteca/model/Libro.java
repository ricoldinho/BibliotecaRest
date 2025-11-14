package edu.rico.rest.Biblioteca.model;

import java.time.LocalDate;

import edu.rico.rest.Biblioteca.model.vo.Isbn;
import edu.rico.rest.Biblioteca.model.vo.Money;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String autor;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "isbn", nullable = false, unique = true, length = 20))
    private Isbn isbn;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "amount", column = @Column(name = "precio", nullable = false, scale = 2)),
        @AttributeOverride(name = "currency", column = @Column(name = "moneda", nullable = false, length = 3))
    })
    private Money precio;

    @Column(length = 100)
    private String editorial;

    @Column
    private LocalDate fechaLanzamiento;

    public Libro() {
    }

    public Libro(String titulo, String autor, Isbn isbn, Money precio, String editorial, LocalDate fechaLanzamiento) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.editorial = editorial;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Isbn getIsbn() {
        return isbn;
    }

    public void setIsbn(Isbn isbn) {
        this.isbn = isbn;
    }

    public Money getPrecio() {
        return precio;
    }

    public void setPrecio(Money precio) {
        this.precio = precio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn.getValue() + ", precio=" + precio
                + ", editorial=" + editorial + ", fechaLanzamiento=" + fechaLanzamiento + "]";
    }
}
