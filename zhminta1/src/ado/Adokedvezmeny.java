package ado;

public abstract class Adokedvezmeny {
	
 	private String	adokedvezmeny;
 	
 	public Adokedvezmeny(String adokedvezmeny)
 	{
 		super();
 		this.adokedvezmeny=adokedvezmeny;
 	}
 	
 	public String getAdotipus()
 	{
 		return adokedvezmeny;
 	}
 	
 	public abstract int getKezdvezmenyMerteke();

}
