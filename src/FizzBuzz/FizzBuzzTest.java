package FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	//Test the ConvertToFizzBuzzValue function for all integers that should return "FizzBuzz"
	@Test
	void TestConvertToFizzBuzzValueForFizzBuzzScenarios() {
		for (int i = FizzBuzz.START_VALUE; i <= FizzBuzz.END_VALUE; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				assertEquals("FizzBuzz", FizzBuzz.ConvertToFizzBuzzValue(i));
			}
		}
	}
	
	//Test the ConvertToFizzBuzzValue function for all integers that should return "Fizz"
	@Test
	void TestConvertToFizzBuzzValueForFizzScenarios() {
		for (int i = FizzBuzz.START_VALUE; i <= FizzBuzz.END_VALUE; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				assertEquals("Fizz", FizzBuzz.ConvertToFizzBuzzValue(i));
			}
		}
	}
	
	//Test the ConvertToFizzBuzzValue function for all integers that should return "Buzz"
	@Test
	void TestConvertToFizzBuzzValueForBuzzScenarios() {
		for (int i = FizzBuzz.START_VALUE; i <= FizzBuzz.END_VALUE; i++) {
			if (i % 3 != 0 && i % 5 == 0) {
				assertEquals("Buzz", FizzBuzz.ConvertToFizzBuzzValue(i));
			}
		}
	}

	//Test the ConvertToFizzBuzzValue function for all integers that should return their integer value as a String
	@Test
	void TestConvertToFizzBuzzValueForIntegerScenarios() {
		for (int i = FizzBuzz.START_VALUE; i <= FizzBuzz.END_VALUE; i++) {
			if (i % 5 != 0 && i % 3 != 0) {
				assertEquals(String.valueOf(i), FizzBuzz.ConvertToFizzBuzzValue(i));
			}
		}
	}

}
