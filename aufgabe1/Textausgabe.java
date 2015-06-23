package aufgabe1;

import java.util.ArrayList;

public class Textausgabe implements AusgabeStrategie {

	@Override
	public void ausgeben(ArrayList<Artikel> artikelliste) {
		for(Artikel iterator : artikelliste){
			System.out.println(iterator.getArtikelbezeichnung() + ": \t" + iterator.getEinzelpreis());
		}
		
	}

}
