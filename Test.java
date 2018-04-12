package testingCalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ie.Calc.BasicCalc;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		BasicCalc calc = new BasicCalc();
		assertEquals(5, calc.add(3.0,2.0));
		assertEquals(10, calc.subtract(30, 20));
		assertEquals(12, calc.multiply(2.0, 6));
		assertEquals(12, calc.divide(144, 12));
		assertEquals(0, calc.divide(2, 0));
		assertEquals(120, calc.factorial(5));
		assertEquals(8, calc.power(2, 3));
		assertEquals(12, calc.sqrt(144));
		assertEquals(0, calc.sqrt(-13));
		assertEquals(4, calc.absolute(-4));
		assertEquals(3, calc.mod(3, 4));
		
	}
}

