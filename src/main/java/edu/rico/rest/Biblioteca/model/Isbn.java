package edu.rico.rest.Biblioteca.model;

import java.util.Objects;
import java.util.regex.Pattern;

import jakarta.persistence.Embeddable;

@Embeddable
public final class Isbn {

    private static final Pattern ISBN_PATTERN = Pattern.compile(
            "^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$");

    private final String value;

    public Isbn(String value) {
        if (value == null || !ISBN_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException("ISBN no válido: " + value);
        }
        this.value = value;
    }

    // Constructor sin argumentos requerido por JPA y MapStruct
    public Isbn() {
        this.value = null;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Isbn isbn = (Isbn) o;
        return Objects.equals(value, isbn.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
