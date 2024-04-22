package lab1;

import java.util.ArrayList; //Import ArrayLists 

public class MainLists {

	public static void main(String[] args) {

		//Einfachere Verwaltung der Namen mit einer Liste 
		ArrayList<String> listeNamen = new ArrayList<String>();
		listeNamen.add(0, "Peter");
		listeNamen.add(1, "Anja");
		listeNamen.add(2, "Klaus");
		listeNamen.add(3, "Wilhelm");
		listeNamen.add(4, "Beate");
		
		listeNamen.add(2, "Klara");
		
		System.out.println("Angemeldete Namen:");
		System.out.println(listeNamen);

		
		//Verwaltung: Maria meldet sich verspätet an
		listeNamen.add(4, "Maria");
		System.out.println("\n\nMaria an Stelle 4 hinzugefuegt");
		System.out.println(listeNamen);

		
		//Verwaltung: Anja meldet sich ab
		String a; //= new String();
		a = listeNamen.remove(1);
		System.out.println("\n\nAnja geloescht:");
		System.out.println(listeNamen);
		System.out.println("\n\nGeloeschtes Element:");
		System.out.println(a);
		
		//Vorsicht. Der erneute Aufruf führt zum Löschen eines weiteren Elements 
		System.out.println("\n\nNoch ein geloeschtes Element:");
		System.out.println(listeNamen.remove(1));
		System.out.println("\nAktuelle Liste:");
		System.out.println(listeNamen);

		
		//Gleiches geht auch für Integer Listen, also für Matrikelnr.
		//Hierzu wird in den Spitzen Klammern der neue Datentyp angegeben
		ArrayList<Integer> listeMatrNr = new ArrayList<Integer>();
		listeMatrNr.add(0, 12345);
		listeMatrNr.add(1, 67890);
		listeMatrNr.add(2, 46183);
		listeMatrNr.add(3, 93167);
		

		System.out.println("\n\nListe an MatrNr:");
		System.out.println(listeMatrNr);
		
		int b;
		b = listeMatrNr.remove(1);
		System.out.println("\n\nGeloeschtes Element:");
		System.out.println(b);

		//Es gibt weitere Methoden im Interface, u.a. kann man prüfen, ob sich ein 
		//Element in der Liste befindet
		System.out.println("\n\nPruefe ob MatrNr 46193 in der Liste:");
		System.out.println(listeMatrNr.contains(46193));

	}

}
