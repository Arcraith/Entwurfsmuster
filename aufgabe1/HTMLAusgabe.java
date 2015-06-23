package aufgabe1;

import java.util.ArrayList;

public class HTMLAusgabe implements AusgabeStrategie{

	@Override
	public void ausgeben(ArrayList<Artikel> artikelliste) {
		System.out.println("<table>");
		for(Artikel iterator : artikelliste){
			System.out.println("\t<tr>");
			System.out.println("\t\t<td>" + iterator.getArtikelbezeichnung() + "</td>");
			System.out.println("\t\t<td>" + iterator.getEinzelpreis() + "</td>");
			System.out.println("\t</tr>");
		}
		System.out.println("</table>");
	}

}
