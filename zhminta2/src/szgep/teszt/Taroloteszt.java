package szgep.teszt;

import java.util.Scanner;

import szgep.Merevlemez;

public class Taroloteszt {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		Merevlemez lemezek[] = new Merevlemez[2];
		String Marka;
		double kapacitas, foglalt;
		
		for(int i=0; i<lemezek.length; i++)
		{
			System.out.println("Adja meg a(z) "+(i+1)+". lemezt." );
			System.out.println("Marka: ");
			Marka=  s.nextLine();
			System.out.println("Kapacitas hely:");
			kapacitas= Integer.parseInt(s.nextLine());
			System.out.println("Foglalt hely:");
			foglalt= Integer.parseInt(s.nextLine());
			
			lemezek[i]= new Merevlemez(Marka,kapacitas,foglalt);
		}
		s.close();
		
		Merevlemez Legnagyobb = getLegnagyobb(lemezek);
		System.out.println("Legnagyobb: " + Legnagyobb.toString() );
		
		for(int i=0; i<lemezek.length; i++)
		{
			System.out.println(lemezek[i].toString());
		}
		
		
	}
	
	static Merevlemez getLegnagyobb(Merevlemez lemezek[])
	{
		int max=0;
		for(int i=1; i<lemezek.length; i++)
		{
			if(lemezek[max].getKapacitas()<lemezek[i].getKapacitas())
				max=i;
			
		}
		return lemezek[max];
	}
	
	static int Terhelt(Merevlemez lemezek[])
	{
		int sum=0;
		for(int i=0; i<lemezek.length; i++)
		{
			if(lemezek[i].getSzabadhely()<lemezek[i].getFoglalt() )
				sum++;
		}
		return sum;
	}
	
	

}
