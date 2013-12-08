package string_calc.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class String_calc_test {

	@Test //ravit
	public void addEmptyStringTest() {
		stringCalc str = new stringCalc();
		int sum = str.Add("");
		assertEquals(0,sum);
	}

	
}
