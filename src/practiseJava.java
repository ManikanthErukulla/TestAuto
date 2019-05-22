
public class practiseJava {	
	
	public int factor(int num)
	{
		int i;		
		int j=1;
		
		for (i = num; i > 0; i--)
		{
			j = j*i;
			
			if (i>1) 
				System.out.print(i+"*");
			else
				System.out.print(i);
		}		
		return j;
	}
		public int findmax(int a, int b, int c)
		{
			int max=0;
			if (a > b)
				max = a;
			else if (b > a)
				max = b;	
			else if (c > max)
				max = c;
			
			return max;	
		}
		public int findmin(int a, int b, int c)
		{
			int min=0;
			if (a < b)
				min = a;
			else if (b < a)
				min = b;	
			else if (c < min)
				min = c;
			return min;
		}
		public String findOddEven(int num)
		{
			if (num%2 ==0)
				return "this is even";
			else
				return "this is odd number";
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiseJava obj = new practiseJava();
		int factorValue =  obj.factor(8);
		System.out.println(" = "+factorValue);		
		int maxValue = obj.findmax(8, 1, 3);		
		System.out.println("Max value is "+maxValue);
		int minValue = obj.findmin(8, 1, 3);
		System.out.println("Min value is "+minValue);
		String str = obj.findOddEven(10);
		System.out.println(str);
		
		
	}
}
