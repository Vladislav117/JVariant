package ru.vladislav117.jvariant.error;

import ru.vladislav117.jvariant.VariantType;

/**
 * Ошибка, возникающая при несоответствии типов значений.
 */
public class VariantValueError extends VariantError {
    /**
     * Создание ошибки, возникающей при несоответствии типов значений.
     *
     * @param actualType   Тип значения
     * @param requiredType Требуемый тип значения
     */
    public VariantValueError(VariantType actualType, String requiredType) {
        super("Object type is " + actualType + ", but it was converted to " + requiredType);
    }
}
