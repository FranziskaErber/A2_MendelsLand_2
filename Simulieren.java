package mendelsLand;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Simulieren {
	public void starten() {
		System.out.println("Hier in Mendel's Land sind viele Schmetterlinge zuhause. Diese haben verschiedene Merkmale:\n"
				+ "Muster: kein Muster(0), schwarze Punkte(1), schwarze Streifen(2)\n"
				+ "Flügelfarbe: rot(0), gelb(1), gruen(2), blau(3)\n"
				+ "Fühlerform: gerade(0), gekruemmt(1)\n");
		Scanner c = new Scanner(System.in);
		List< Schmetterling > kinder = new ArrayList<Schmetterling>();
		
		do
		{
			System.out.println("Bitte eingeben: Wie sieht die Mutter aus?\nin folgender Schreibweise:\nMuster, Farbe, Form");
			int m = c.nextInt();
			int fa = c.nextInt();
			int fo = c.nextInt();
			
			Schmetterling mutter = new Schmetterling(m, fa, fo);
			System.out.println(mutter.toString());
			
			System.out.println("Bitte nun ebenfalls eingeben: Wie sieht der Vater aus?\nauch in folgender Schreibweise:\nMuster, Farbe, Form");
			m = c.nextInt();
			fa = c.nextInt();
			fo = c.nextInt();
			Schmetterling vater = new Schmetterling(m, fa, fo);
			System.out.println(vater.toString());
			
			
			kinder = Schmetterling.naechsteGeneration(mutter, vater);
			
			/*
			for (Schmetterling e:kinder)
			{
				System.out.println(e);
			}
			*/
		
			System.out.println("In dieser Generation gibt es: " + kinder.size() + " neue Schmetterlinge.");
			
			Statistik allg = new Statistik(kinder);
			allg.allgStatistik(kinder, mutter, vater);
			
			System.out.println("Willst du nochmal neue Eltern eingeben?");
			//boolean x = c.nextBoolean();
		 
		} 
		while (c.nextBoolean());
		
		
		System.out.println("Welches Merkmal haben alle Schmetterlinge, die du einsammeln möchtest?");
		String input = c.nextLine();
		
		Statistik verbl = new Statistik(kinder);
		
		verbl.outVerbliebeneMerkmale(verbl.verbliebeneMerkmale(kinder, input));
		
// HMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
		/*
		if(merkmalMutter.checkMerkmal(input) || merkmalVater.checkMerkmal(input)) {
			Statistik verblM = new Statistik(kinder);
			Map<String, Integer> sonstM = verblM.verbliebeneMerkmale(kinder, input);
			verblM.outVerbliebeneMerkmale(sonstM);
		}
		else {
			System.out.println("Bitte ein gültiges Merkmal eingeben.");
		}
		
		*/
		
		
		
		
		//simuliere
		//Mutter und Vater erfragen - erledigt
		//soll erste Statistik ausgegeben werden ja/nein
		//soll nach einem Merkmal gefiltert werden ja/nein
		
		c.close();
	}
	}

