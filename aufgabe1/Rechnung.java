package aufgabe1;

import java.util.ArrayList;

public class Rechnung {

	private ArrayList<Artikel> artikelliste;
	private AusgabeStrategie ausgabeStrategie;
	
	public Rechnung(){
		artikelliste = new ArrayList<Artikel>();
	}
	
	public void add(Artikel artikel){
		artikelliste.add(artikel);
	}
	
	public void setAusgabeStrategie(AusgabeStrategie ausgabeStrategie){
		this.ausgabeStrategie = ausgabeStrategie;
	}
	
	public void drucken(){
		ausgabeStrategie.ausgeben(artikelliste);
	}
}
