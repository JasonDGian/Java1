package unidad4.ejercicios.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iesjandula.unit4project.ejemplosenclase.ArrayMetodos;

class Exercise16_17Test {



	@Test
	void returnArrayWithPositivesTest() {

		Integer[] arrayInit = unidad4.ejemplosenclase.ArrayMetodos.rellenaArrayAleatoriosWrap(20, -50, 50);

		Integer[] arrayTest = unidad4.ejercicios.ingles.problem16_17_18_19.problem16_17_18_19.returnArrayWithPositives(arrayInit);

		for (Integer item : arrayTest) {

			assertNotNull(item);

			assertTrue(item > 0, "Item tiene que ser positivo");
		}

	}


	@Test
	void returnArrayWithNegativesTest() {

		Integer[] arrayInit = unidad4.ejemplosenclase.ArrayMetodos.rellenaArrayAleatoriosWrap(20, -50, 50);

		Integer[] arrayTest = unidad4.ejercicios.ingles.problem16_17_18_19.problem16_17_18_19.returnArrayWithNegatives(arrayInit);


		for (Integer item : arrayTest) {

			assertNotNull(item);

			assertTrue(item < 0, "Item tiene que ser negativo");
		}

	}



}