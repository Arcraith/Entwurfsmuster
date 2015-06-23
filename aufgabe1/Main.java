package aufgabe1;

public class Main {

	public static void main(String[] args) {
		Rechnung rechnung = new Rechnung();
		
		rechnung.add(new Artikel("Drink", 3.99));
		rechnung.add(new Artikel("Essen", 1.49));
		rechnung.add(new Artikel("Messer", 0.99));
		
		rechnung.setAusgabeStrategie(new HTMLAusgabe());
		
		rechnung.drucken();
	}
}
