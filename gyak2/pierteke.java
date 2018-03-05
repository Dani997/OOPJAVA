package first1;

public class pierteke {

	public static void main(String[] args) {
		double wallis=1;
		int nevezo=1;
		int szamlalo=0;
		for(int i=0;i<1000;i++){
			
			if(i%2==0){
				szamlalo=szamlalo+2;
			}
			
			if(i%2==1){
				nevezo=nevezo+2;
			}
			wallis=wallis*(szamlalo*1.0/nevezo);
		}
		System.out.println("Pi értéke (Wallis) " +(wallis*2));
		
		double leibniz=0;
		nevezo=1;
		szamlalo=1;
		for(int i=0;i<1000;i++){
			if(i%2==0){
				leibniz=leibniz+(szamlalo*1.0/nevezo);
			}else{
				leibniz=leibniz-(szamlalo*1.0/nevezo);
			}
			nevezo=nevezo+2;
		}
		System.out.println("PI értéke (Leibniz) "+ (leibniz*4));
	}
}
