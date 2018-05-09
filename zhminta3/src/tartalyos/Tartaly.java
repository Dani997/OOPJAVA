package tartalyos;

public class Tartaly extends Tarolo {
	private double nyomas;
	
	public Tartaly(int terfogat, double nyomas)
	{
		super(terfogat);
		this.nyomas=nyomas;
	}

	public String toString()
	{
		if(this.veszelyese())
			return this.getTerfogat() + "  " + this.nyomas+  "  " + "Veszelyes!!!";
		return this.getTerfogat() + "  " + this.nyomas+  "  " + "Nem Veszelyes!!!";
	}
	
	
	@Override
	public boolean veszelyese() {
		if(this.getTerfogat()*nyomas >100 )
			return true;
		return false;
	}
	
	public boolean Nagyobbe(Tartaly t)
	{
		if(this.nyomas> t.nyomas)
			return true;
		return false;
	}
	
	public Tartaly ezNagyobb(Tartaly t1, Tartaly t2)
	{
		if(t1.getTerfogat() >= t2.getTerfogat())
			return t1;
		return t2;
	}
	
	
	

}
