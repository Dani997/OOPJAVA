package gyak3;
import java.util.Random;

public class d0301_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tomb=new int[10];
		Random rand=new Random();
		for(int i=0;i<tomb.length;i++){
			tomb[i] = rand.nextInt(50)+1;
		}
		for(int i=tomb.length-1;i>=0;i--){
			System.out.println("Az "+(i+1)+" elem: "+tomb[i]);
		}
		int max=0;
		for(int i=0;i<tomb.length;i++){
			if(tomb[i]%2==0){
				if(max<tomb[i]){
					max=tomb[i];
				}
			}
		}
		int max2=0;
		System.out.println("Legnagyobb páros szám: "+max);
		for(int elem:tomb){
			if(elem%2==0){
				if(max2<elem){
					max2=elem;
				}
			}
		}
		System.out.println("Legnagyobb páros szám: "+max2);
		
	}

}
