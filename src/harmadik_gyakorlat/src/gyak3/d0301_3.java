package gyak3;

import java.util.Scanner;

public class d0301_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] tomb=new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Adja meg a sz�mokat!");
		double szorzat=1;
		for(int i=0;i<tomb.length;i++){
			System.out.println("Adja meg az "+(i+1)+" sz�mot!");
			tomb[i]=input.nextDouble();
			szorzat=szorzat*tomb[i];
		}
		
		double eredmeny=Math.pow(szorzat,(-1)*tomb.length);
		System.out.println("A m�rtani �tlag: "+eredmeny);
		
		input.close();
	}


}
