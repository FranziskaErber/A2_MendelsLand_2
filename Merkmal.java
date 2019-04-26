package mendelsLand;

import java.util.Random;

/**
 * ? Brauchen wir diese Klasse wirklich??
 * @author chef
 *
 */

public class Merkmal
{
	
	private String muster;
	private String farbe;
	private String form;
	//private String[] form = new String[3];
	
	public Merkmal(int mu, int fa, int fo)
	{
		String[] musterA = {"kein Muster", "schwarze Punkte", "schwarze Streifen"};
		String[] farbeA = {"rot", "gelb", "gruen", "blau"};
		String[] formA = {"gerade", "gekruemmt"};
		this.muster = musterA[mu];
		this.farbe = farbeA[fa];
		this.form = formA[fo];
	}
	
	Random rand = new Random();

	/*
	 * Konstruktor, um ein Kindschmetterling zu erzeugen
	 */
	public Merkmal(Schmetterling mutter, Schmetterling vater)
	{
		if (rand.nextInt(2) == 0)
		{
			this.muster = mutter.getMerkmal().getMuster();
		}
		else
		{
			this.muster = vater.getMerkmal().getMuster();
		}

		if (rand.nextInt(2) == 0)
		{
			this.farbe = mutter.getMerkmal().getFarbe();
		}
		else
		{
			this.farbe = vater.getMerkmal().getFarbe();
		}
		
		if (rand.nextInt(2) == 0)
		{
			this.form = mutter.getMerkmal().getForm();
		}
		else
		{
			this.form = vater.getMerkmal().getForm();
		}

	}
	
	/**
	 * Konstruktor Merkmal abhängig von mu fa fo
	 * @param mu
	 * @param fa
	 * @param fo
	 
	public Merkmal(String mu, String fa, String fo)
	{
		switch(mu){
			case "kein Muster":
				this.musterS = musterA[1];
				break;
			case "schwarze Punkte":
				this.musterS = musterA[2];
				break;
			case "schwarze Streifen":
				this.musterS = musterA[3];
				break;
			default:
				System.out.println("\nEs muss ein gueltiges Muster eingegeben werden!");
		}
		
		switch(fa){
			case "rot":
				this.farbeS = farbeA[1];
				break;
			case "gelb":
				this.farbeS = farbeA[2];
				break;
			case "gruen":
				this.farbeS = farbeA[3];
				break;
			case "blau":
				this.farbeS = farbeA[4];
				break;
			default:
				System.out.println("\nEs muss eine gueltige Farbe eingegeben werden!");
		}
		
		switch(fo){
			case "gerade":
				this.farbeS = farbeA[4];
				break;
			case "gekruemmt":
				this.farbeS = farbeA[4];
				break;
			default:
				System.out.println("\nEs muss eine gueltige Form eingegeben werden!");
		}
		
	}*/
	
	public String getMuster(){
		return muster;
	}
	
	public String getFarbe(){
		return farbe;
	}
	
	public String getForm(){
		return form;
	}
	
	/*
	public boolean checkMerkmal(String merk){
		boolean check = false;
		for (String s : musterA) {
			if (s.equal (merk)) {
				check = true;
			}
		}
		
		if (!check) {
			for (String s : farbeA) {
				if (s.equals(merk)) {
					check = true;
				}
			}
			
			if (!check) {
				for (String s : formA) {
					if (s.equals(merk)) {
						check = true;
					}
				}
			}	
		}
		
		return check;
		
	}*/
}
