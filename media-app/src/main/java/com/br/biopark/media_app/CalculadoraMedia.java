package com.br.biopark.media_app;

public class CalculadoraMedia {

    public static String calcularStatus(double nota1, double nota2, double nota3) {
        if (!validarNota(nota1) || !validarNota(nota2) || !validarNota(nota3)) {
            throw new IllegalArgumentException("As notas devem estar entre 0 e 10.");
        }

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 4) {
            return "2ª Oportunidade";
        } else {
            return "Reprovado";
        }
    }

    private static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 10;
    }
}