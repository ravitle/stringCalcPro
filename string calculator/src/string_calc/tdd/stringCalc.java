package string_calc.tdd;

public class stringCalc {

	public int Add(String string) {
		if(string.equals(""))
			return 0;
		
	int i;
	 for(i = 0; i < string.length(); i++)
			if(string.charAt(i) == ',')
					break;
	int num1 = stringToInt(string,0,i);
		return num1;
	
	}
	
	
	private int stringToInt(String str ,int k , int i)
	{
		
		int j,sum = 0;
		for(j = k; j < i; j++)
			sum = sum*10 + str.charAt(j) - '0';
		return sum;
		
		
		
	}


}
