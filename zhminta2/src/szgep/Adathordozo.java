package szgep;

public abstract class Adathordozo {
	private String marka;
	private double kapacitas;
	
	public Adathordozo(String marka, double kapaciatas)
	{
		super();
		this.marka=marka;
		this.kapacitas=kapaciatas;
	}
	
	public double getKapacitas()
	{
		return this.kapacitas;
	}
	
	public String getTipus()
	{
		return this.marka;
	}
	
	public abstract double getSzabadhely();

}
