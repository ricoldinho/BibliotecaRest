package edu.rico.rest.Biblioteca.model.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import edu.rico.rest.Biblioteca.model.vo.FechaNacimiento;

@Converter(autoApply = false)
public class FechaNacimientoAttributeConverter implements AttributeConverter<FechaNacimiento, String> {

    @Override
    public String convertToDatabaseColumn(FechaNacimiento attribute) {
        if (attribute == null) return null;
        Integer d = attribute.getDia();
        Integer m = attribute.getMes();
        Integer y = attribute.getAnho();
        if (d == null || m == null || y == null) return null;
        return String.format("%04d-%02d-%02d", y, m, d);
    }

    @Override
    public FechaNacimiento convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.trim().isEmpty()) return null;
        String s = dbData.trim();
        String[] parts = s.split("-|");
        // Try split by dash
        parts = s.split("-");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Formato de fecha_nacimiento inválido: " + dbData);
        }
        try {
            int y = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int d = Integer.parseInt(parts[2]);
            return new FechaNacimiento(d, m, y);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Fecha_nacimiento con formato inválido: " + dbData, ex);
        }
    }
}
