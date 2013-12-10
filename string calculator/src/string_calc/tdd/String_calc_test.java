package string_calc.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class String_calc_test {

	@Test //ravit
	public void addEmptyStringTest() {
		stringCalc str = new stringCalc();
		int sum = 0;
		try{
			sum = str.Add("");
		}
		catch(Exception e){}
		assertEquals(0,sum);
	}

	@Test //oz
	public void addStringOneNumberTest() {
		stringCalc str = new stringCalc();
		int sum=0;
		try{
		sum = str.Add("5");
		}
		catch(Exception e){}
		assertEquals(5,sum);
	}
	

	@Test // oz
	public void addStringTwoNumberTest() {
		stringCalc str = new stringCalc();
		int sum = 0;
		try{
			sum = str.Add("5,2");
		}
		catch(Exception e){}
		assertEquals(7,sum);
	
	}
	
	@Test
	public void addSrtingMultNumnersTest(){
		stringCalc str = new stringCalc();
		int sum = 0;
		try{
			sum = str.Add("5,2,4,11");
		}
		catch(Exception e){}
		assertEquals(22,sum);
	}	
	@Test
	public void diffrentDelTest(){
		stringCalc str = new stringCalc();
		int sum = 0;
		try{
			sum = str.Add("//-\n5-2-4-11");
		}
		catch(Exception e){}
		assertEquals(22,sum);
	}
	
	@Test
	public void negNumTest(){
		stringCalc str = new stringCalc();
		int sum = 0;
		try{
			sum = str.Add("//,\n-5,-2,-4,-11");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}

