package szgep;

public class Merevlemez extends Adathordozo 

{
	private double foglalt;
	
	public Merevlemez(String marka, double kapaciatas, double foglalt) {
		super(marka, kapaciatas);
		this.foglalt=foglalt;
	}
	
	public double getFoglalt()
	{
		return foglalt;
	}

	@Override
	public double getSzabadhely() {
		
		return this.getKapacitas()-foglalt;
	}
	
	public String toString()
	{
		return "\nTipus: "+this.getTipus()+ "\nKapacitas: "+this.getKapacitas()+ "\nFoglalt: "+this.foglalt+ "\nSzabad: "+this.getSzabadhely();
	}
	
	public boolean ezNagyobbe(Merevlemez hdd)
	{
		if(this.getSzabadhely() > hdd.getSzabadhely())
			return true;
		return false;
	}
	
	static Merevlemez melyikNagyobb(Merevlemez hdd1, Merevlemez hdd2)
	{
		if( hdd1.getKapacitas() > hdd2.getKapacitas())
			return hdd1;
		return hdd2;
	}
	
	
	
	
	

}
