package com.unitTesting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestingApplicationTests {
	
	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		
		//expected result
		int expected = 18;
		
		//actual result
		int result = calculator.doSum(2, 7, 9);
		
		assertThat(result).isEqualTo(expected);
	}
	
	//product test
	@Test
	public void testProduct() {
		//expected result
		int expected = 10;
		//actual result
		int result = calculator.doMult(5, 2);
		assertThat(result).isEqualTo(expected);
	}
	
	//compare test
	@Test
	void testCompareNums() {
		
		//expected result
		boolean ex = true;
		boolean result = calculator.compareTwoNumbers(2, 2);
		assertThat(result).isTrue();
	}

}
