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
		if(i == string.length())
			return num1;
	int num2 = stringToInt(string,i+1, string.length());
		return num1 + num2;	
			
	
			
			
			
	}
	
	
	private int stringToInt(String str ,int k , int i)
	{
		
		int j,sum = 0;
		for(j = k; j < i; j++)
			sum = sum*10 + str.charAt(j) - '0';
		return sum;
			
	}


}
