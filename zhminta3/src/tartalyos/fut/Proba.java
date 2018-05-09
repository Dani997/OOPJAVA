package tartalyos.fut;

import tartalyos.Tartaly;
import java.util.Scanner;

public class Proba {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		Tartaly tart[] = new Tartaly[5];
		int terfogat;
		double nyomas;
		
		for(int i=0; i<tart.length; i++)
		{
			System.out.println("Adja meg a kovetkezo tartalyt "+ (i+1)+"  :" );
			System.out.println("Terfogat ");
			terfogat=Integer.parseInt(s.nextLine());
			System.out.println("Nyomas ");
			nyomas=Double.parseDouble(s.nextLine());
			
			tart[i]= new Tartaly(terfogat, nyomas);
		}
		s.close();
		
		for(int i=0; i<tart.length; i++)
		{
			System.out.println("Tartaly "+ (i+1)+". adatai:" );
			System.out.println(tart[i].toString());	
		}
		
		Tartaly max=legnagyobbNyomas(tart);
		Tartaly max2=legnagyobbTerfogat(tart);
		System.out.println("Legnagyobb nyomasu: " + max.toString() );
		System.out.println("Legnagyobb terfogatu: " + max2.toString() );

	}
	
	static Tartaly legnagyobbNyomas(Tartaly t[])
	{
		int m=0;
		for(int i=1; i<t.length; i++)
		{
			if(!t[m].Nagyobbe(t[i]))
				m=i;
		}
		return t[m];
	}
	
	static Tartaly legnagyobbTerfogat(Tartaly t1[])
	{
		int m=0;
		for(int i=1; i<t1.length; i++)
		{
			if(t1[m].getTerfogat()< t1[i].getTerfogat())
				m=i;
		}
		return t1[m];
	}

}
