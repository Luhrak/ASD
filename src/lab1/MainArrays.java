package lab1;

public class MainArrays {
	
	public static void main(String[] args) {
		
		//Namen in Array speichern, welche sich zum Kurs angemeldet haben 
		String [] arrayNamen = new String[5];
		arrayNamen[0] = "Peter";
		arrayNamen[1] = "Anja";
		arrayNamen[2] = "Klaus";
		arrayNamen[3] = "Wilhelm";
		arrayNamen[4] = "Beate";
		
		
		System.out.println("Angemeldete Namen:");
		for (int i = 0; i < arrayNamen.length; i++) {
		System.out.println(arrayNamen[i]);
		}
		

		//Verwaltung: Maria meldet sich verspätet an, array ist aber voll. 
		//Einfügen von Maria an einer Position würde einen anderen Datensatz 
		//überschreiben 
		arrayNamen[4] = "Maria";
		System.out.println("\n\nMaria an Stelle 4 eingefügt:");
		for (int i = 0; i < arrayNamen.length; i++) {
		System.out.println(arrayNamen[i]);
		}

		//Beate wieder auf die Liste setzen
		arrayNamen[4] = "Beate";
		//Um Maria mit aufzunehmen, müssen wir ein neues (groesseres) Array
		//erstellen
		String[] extendedArrayNamen = new String[(arrayNamen.length)+1];
		System.arraycopy(arrayNamen, 0, extendedArrayNamen, 0, arrayNamen.length);
		extendedArrayNamen[arrayNamen.length] = "Maria";

		System.out.println("\n\nMaria am Ende hinzugefuegt:");
		for (int i = 0; i < extendedArrayNamen.length; i++) {
		System.out.println(extendedArrayNamen[i]);
		}

		//Verwaltung: Anja meldet sich ab. 
		//Eintrag an genau der Stelle wird auf NULL gesetzt 
		extendedArrayNamen[1] = null;

		System.out.println("\n\nZweiter Eintrag geloescht:");
		for (int i = 0; i < extendedArrayNamen.length; i++) {
		System.out.println(extendedArrayNamen[i]);
		}
		
		//Wenn statt Namen MatrNr gespeichert werden sollen, muss alles 
		//erneut programmiert werden mit einem Integeer Array
		int [] arrayMatrNr = new int[4];
		arrayMatrNr[0] = 12345;
		arrayMatrNr[1] = 67890;
		arrayMatrNr[2] = 46183;
		arrayMatrNr[3] = 93167;

		System.out.println("\n\nListe als Integer Liste mit Matrikelnr:");
		for (int i = 0; i < arrayMatrNr.length; i++) {
		System.out.println(arrayMatrNr[i]);
		}

		
		//Verwaltung: Maria meldet sich verspätet an
		int[] extendedArrayMatrNr = new int[(arrayMatrNr.length)+1];
		System.arraycopy(arrayMatrNr, 0, extendedArrayMatrNr, 0, arrayMatrNr.length);
		extendedArrayMatrNr[arrayMatrNr.length] = 83716;
		
		System.out.println("\n\ninkl. neue Matrikelnr:");
		for (int i = 0; i < extendedArrayMatrNr.length; i++) {
		System.out.println(extendedArrayMatrNr[i]);
		}		
	}
}
