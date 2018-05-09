package tartalyos;

public abstract class Tarolo {
	private int terfogat;
	
	public Tarolo(int terfogat)
	{
		super();
		this.terfogat=terfogat;
	}
	public abstract boolean veszelyese();
	
	public int getTerfogat()
	{
		return this.terfogat;
	}
	

}
