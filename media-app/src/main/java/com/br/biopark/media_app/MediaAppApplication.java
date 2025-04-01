package com.br.biopark.media_app;
import java.util.Scanner;

public class MediaAppApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();

		try {
			String status = CalculadoraMedia.calcularStatus(nota1, nota2, nota3);
			System.out.println("Status do aluno: " + status);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		scanner.close();
	}
}