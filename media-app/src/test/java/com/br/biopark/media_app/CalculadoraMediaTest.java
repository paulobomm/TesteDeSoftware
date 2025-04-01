package com.br.biopark.media_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraMediaTest {

    @Test
    void testAprovado() {
        assertEquals("Aprovado", CalculadoraMedia.calcularStatus(8, 7, 9));
    }

    @Test
    void testSegundaOportunidade() {
        assertEquals("2ª Oportunidade", CalculadoraMedia.calcularStatus(5, 6, 4));
    }

    @Test
    void testReprovado() {
        assertEquals("Reprovado", CalculadoraMedia.calcularStatus(2, 3, 3));
    }

    @Test
    void testNotaInvalida() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraMedia.calcularStatus(11, 5, 6);
        });
        assertEquals("As notas devem estar entre 0 e 10.", exception.getMessage());
    }

    @Test
    void testMediaLimite() {
        assertEquals("Aprovado", CalculadoraMedia.calcularStatus(7, 7, 7));
        assertEquals("2ª Oportunidade", CalculadoraMedia.calcularStatus(4, 4, 4));
    }
}