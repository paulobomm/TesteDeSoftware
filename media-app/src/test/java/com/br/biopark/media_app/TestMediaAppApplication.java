package com.br.biopark.media_app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestMediaAppApplication {

	@Test
	void testClassInstantiation() {
		// Instanciando a classe para verificar que ela pode ser criada com sucesso
		TestMediaAppApplication testClass = new TestMediaAppApplication();
		assertNotNull(testClass, "A instância da classe não deveria ser nula.");
	}
}