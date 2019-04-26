package mendelsLand;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Schmetterling
{
	private Scanner scanner = new Scanner(System.in);
	private Merkmal merkmal;

	public Schmetterling(int mu, int fa, int fo)
	{
		this.merkmal = new Merkmal(mu, fa, fo);
	}
	
	public Schmetterling(Schmetterling mutter, Schmetterling vater)
	{
		this.merkmal = new Merkmal(mutter, vater);
	}
	
	/*
	 * mit dieser Methode sollen 1000-2000 Kinder mit zufälligen Merkmalen von Mutter oder Vater erzeugt werden
	 */
	public static ArrayList<Schmetterling> naechsteGeneration(Schmetterling mutter, Schmetterling vater)
	{
		ArrayList< Schmetterling > kinder = new ArrayList<>();
		int k = anzKinder();
		
		for ( int i = 0; i < k; i++ )
		{
			Schmetterling s = new Schmetterling(mutter, vater);
			kinder.add(s);
		}
		
		return kinder;
	}
	
	/*
	 * mit dieser Methode wir zufällig bestimmt, wie viele Kinder es in der nächsten Generation gibt
	 */
	public static int anzKinder()
	{
		return (int)( Math.random() * 1001 ) + 1000;
	}
	
	//Merkmal merk = new Merkmal();

	public Merkmal getMerkmal()
	{
		return this.merkmal;
	}
	
	@Override
	public String toString()
	{
		String details = "Muster: " + merkmal.getMuster()
				+ "; Farbe: " + merkmal.getFarbe()
				+ "; Form: " + merkmal.getForm();
		return details;
	}
	
/*	public Schmetterling erzeugeKind(String[] merkmale)
	{
		scanner.next
		Schmetterling kind = new Schmetterling(muster, farbe, form);
		return kind;
	}
	
	uni, rot, gekrümmt
*/	
	
}
