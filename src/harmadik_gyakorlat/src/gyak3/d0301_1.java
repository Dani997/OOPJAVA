package gyak3;


import java.util.Scanner;

public class d0301_1 {

	public static void elsoBeolvas(){
		Scanner input = new Scanner(System.in);
		System.out.println("Add meg az egyik számot");
		int a = input.nextInt();
		System.out.println("Add meg a mûveletet");
		String muvelet=input.next();
		System.out.println("Add meg a másik számot");
		int b = input.nextInt();
		double eredmeny=0;
		switch (muvelet){
			case "+":
				eredmeny=a+b;
				break;
			case "-":
				eredmeny=a-b;
				break;
			case "/":
				if(b!=0){
					eredmeny=(double)a/b;
				}
				break;
			case "*":
				eredmeny=a*b;
				break;
				default:
					System.out.println("Rossz mûvelet");
		}
		System.out.println("Az eredmény: "+eredmeny);
		input.close();
	}
	public static void masodikBeolvas(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kérem a számokat és a mûveletet ");
		
		String sor=input.nextLine();
		
		System.out.println(sor);
		
		String[] karakterek=sor.split(" ");
		int a=Integer.parseInt(karakterek[0]);
		String muvelet=karakterek[1];
		int b=Integer.parseInt(karakterek[2]);
		double eredmeny=0;
		switch (muvelet){
			case "+":
				eredmeny=a+b;
				break;
			case "-":
				eredmeny=a-b;
				break;
			case "/":
				if(b!=0){
					eredmeny=(double)a/b;
				}
				break;
			case "*":
				eredmeny=a*b;
				break;
				default:
					System.out.println("Rossz mûvelet");
		}
		System.out.println("Az eredmény: "+eredmeny);
		input.close();
	}

	public static void main(String[] args) {
		
		masodikBeolvas();
		
	}

}
