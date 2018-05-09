package ado.teszt;

import ado.CsaladiAdokedvezmeny;
import java.util.Scanner;

public class AdozasTeszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		CsaladiAdokedvezmeny csad[] = new CsaladiAdokedvezmeny[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Adja meg a gyerekek szamat:");
			csad[i] = new CsaladiAdokedvezmeny( Integer.parseInt(s.nextLine()));
		}
		s.close();
		for (int i = 0; i < csad.length; i++)
		{
			System.out.println(csad[i].toString());
		}
		CsaladiAdokedvezmeny max = LegynagyobbKedvezmeny(csad);
		System.out.println("Legnagyobb kev:" + max.toString());
		
		System.out.println("3 vagy tobb kedvezmeny:" + TobbmintHarom(csad));
		
	}
	
	static CsaladiAdokedvezmeny LegynagyobbKedvezmeny(CsaladiAdokedvezmeny kedv[])
	{
		int maxi=0;
		for(int i=1; i< kedv.length; i++)
		{
			if(!kedv[maxi].ezNagyobbe(kedv[i]))
			maxi=i;
		}
		return kedv[maxi];
	}
	
	static int TobbmintHarom(CsaladiAdokedvezmeny kedv[])
	{
		 int sum=0;
		for(int i=0; i<kedv.length; i++)
		{
			if(kedv[i].getGyerekekSzama()>2)
				sum++;
		}
		return sum;
	}

}
