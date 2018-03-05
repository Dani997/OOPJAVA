package gyak2_hazi;

public class H2_pitagoraszsz3 {
	
	public static void main(String[] args) {
	
		for(int a=1; a<=50; a++)
		{
			for(int b=a; b<=50; b++)
			{
				for(int c=b; c<=50; c++)
				{
					if(pitagoras(a,b,c))
						System.out.println(a + ",\t" + b + ",\t" + c +",");
				}
			}
		}
	}
	
	public static boolean pitagoras(int a, int b, int c)
	{
		boolean t= (a*a+b*b==c*c);
		return t;
	}

}
