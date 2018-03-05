package gyak2_hazi;

public class H1_Euler {
	
	
	private static double number_e(int accuarcy) {
        double e=1, fact=1;
        
        for ( int i=1; i <= accuarcy; i++) {
            fact = fact*i; 		//faktorialis
           
            e += 1.0/fact;  	//kepzesi szabaly
        }
        return e;
    }

	public static void main(String[] args) {
		
		System.out.println("acc=100:  e = " + number_e(100));
		System.out.println("acc=1000: e = " + number_e(1000));
	}

}
