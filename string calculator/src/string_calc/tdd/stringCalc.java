package string_calc.tdd;

public class stringCalc {

	public int Add(String string) {
		if(string.equals(""))
			return 0;
		
	int i,j;
	char del =',';
	if(string.charAt(0) == '/' && string.charAt(1) == '/' && string.charAt(3) == '\n'){
		del = string.charAt(2);
		string=string.substring(4);
	}
		
	 for(i = 0; i < string.length(); i++)
			if(string.charAt(i) == ',' || string.charAt(i) == '\n' || string.charAt(i) == del)
					break;
	int num1 = stringToInt(string,0,i);
	if(i == string.length())
			return num1;	
	for(j = i; j < string.length(); j++)
		if(string.charAt(j) ==',' || string.charAt(j) == '\n' || string.charAt(j) == del )
		 	{
				if(string.charAt(j-1) ==',' || string.charAt(j-1) =='\n' || string.charAt(j-1) == del)
					return -1;
		 		num1 += stringToInt(string,i+1,j);
		 		i = j;
		 	}	
	num1+=stringToInt(string, i+1, string.length());
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
