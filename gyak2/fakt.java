package first1;

public class fakt {
	
	public static void main(String[] args) {
		for (int i=1;i<=10;i++){
			System.out.println(i+ " " + faktRek(i));
			System.out.println(i+ " " + faktor(i));
		}
	
	}
	
	public static int faktRek(int szam){
		if(szam==1){
			return szam;
		}
		if (szam==0){
			return 1;
		}
		return faktRek(szam-1)*szam;
	}
	
	public static int faktor(int szam){
		int eredmeny=1;
		for(int i=1; i<=szam; i++){
			eredmeny=eredmeny*i;
		}
		return eredmeny;
	}
	
	
}