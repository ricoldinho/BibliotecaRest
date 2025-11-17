package edu.rico.rest.Biblioteca.model.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import edu.rico.rest.Biblioteca.model.vo.Dni;

@Converter(autoApply = false)
public class DniAttributeConverter implements AttributeConverter<Dni, String> {

    @Override
    public String convertToDatabaseColumn(Dni attribute) {
        if (attribute == null) return null;
        Integer num = attribute.getNumero();
        Character letra = attribute.getLetra();
        if (num == null || letra == null) return null;
        return String.valueOf(num) + letra;
    }

    @Override
    public Dni convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.trim().isEmpty()) return null;
        String s = dbData.trim();
        if (s.length() < 2) {
            throw new IllegalArgumentException("Formato de DNI inválido: " + dbData);
        }
        String numberPart = s.substring(0, s.length() - 1);
        char letter = s.charAt(s.length() - 1);
        try {
            Integer num = Integer.parseInt(numberPart);
            return new Dni(num, letter);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Número de DNI inválido: " + numberPart, ex);
        }
    }
}
