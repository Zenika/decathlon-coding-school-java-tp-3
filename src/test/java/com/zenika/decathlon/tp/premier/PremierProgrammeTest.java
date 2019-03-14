package com.zenika.decathlon.tp.premier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class PremierProgrammeTestTest {

	@TestFactory public Collection<DynamicTest> translateDynamicTests() {
		
		Map<Integer, Integer> mappings = new HashMap<Integer, Integer>() {{
			put(1, 1);
			put(2, 1);
			put(3, 2);
			put(4, 3);
			put(5, 5);
			put(6, 8);
			put(7, 13);
			put(8, 21);
			put(9, 34);
			put(10, 55);
		}};

		Collection<DynamicTest> dynamicTests = new ArrayList<>();
		for(Map.Entry<Integer, Integer> mapping : mappings.entrySet()) {
			// create an test execution
			Executable exec = () -> testFibonacciFor(mapping.getKey(), mapping.getValue());

			// create a test display name
			String testName = String.format("La valeur de Fibonacci pour %d doit être %d ", mapping.getKey(), mapping.getValue());

			// create dynamic test
			DynamicTest dTest = DynamicTest.dynamicTest(testName, exec);

			// add the dynamic test to collection
			dynamicTests.add(dTest);
			
		}
		return dynamicTests;

	}

	private void testFibonacciFor(int number, int value) {
		Assertions.assertThat(PremierProgramme.fibonacci(number)).isEqualTo(value);
	}
}
