package aufgabe1;

public class Artikel {

	private String artikelbezeichnung;
	private double einzelpreis;
	
	public String getArtikelbezeichnung() {
		return artikelbezeichnung;
	}
	public void setArtikelbezeichnung(String artikelbezeichnung) {
		this.artikelbezeichnung = artikelbezeichnung;
	}
	public double getEinzelpreis() {
		return einzelpreis;
	}
	public void setEinzelpreis(double einzelpreis) {
		this.einzelpreis = einzelpreis;
	}
	
	public Artikel(String artikelbezeichnung, double einzelpreis) {
		super();
		this.artikelbezeichnung = artikelbezeichnung;
		this.einzelpreis = einzelpreis;
	}
	
}
