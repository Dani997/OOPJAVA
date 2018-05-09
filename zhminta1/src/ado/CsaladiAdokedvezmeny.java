package ado;

public class CsaladiAdokedvezmeny extends Adokedvezmeny {

	private int gyerekekszama;
	private int egyGyerekKedvM;
	public static int[] tomb = { 10000, 17500, 33000 };
	
	public CsaladiAdokedvezmeny(int gyerekekszama)
	{
		super("Csaladi adokedvezmeny");
		
		this.gyerekekszama=gyerekekszama;
		if(gyerekekszama==1) 
			this.egyGyerekKedvM=tomb[0];
		if(gyerekekszama==2) 
			this.egyGyerekKedvM=tomb[1];
		if(gyerekekszama>2) 
			this.egyGyerekKedvM=tomb[2];
	}

	public int getGyerekekSzama()
	{
		return this.gyerekekszama;
	}
	
	public int getEgyGyerekKed()
	{
		return this.egyGyerekKedvM;
	}
	
	public String toString()
	{
		return "\ngyerekekszama: "+ this.gyerekekszama + "\nkedvezmeny/fo:  "+
				this.egyGyerekKedvM + "\nosszes kedv.:  " + this.getKezdvezmenyMerteke();
	}
	
	public boolean ezNagyobbe(CsaladiAdokedvezmeny csad)
	{
		if(this.getKezdvezmenyMerteke() > csad.getKezdvezmenyMerteke() )
			return true;
		return false;
	}
	
	@Override
	public int getKezdvezmenyMerteke() {
		
		return this.gyerekekszama*this.egyGyerekKedvM;
	}
	
	

	
	
	
}
