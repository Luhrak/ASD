package lab3;
import java.util.ArrayList;

public class insertionSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		liste.add(5);
		liste.add(10);
		liste.add(15);
		liste.add(4);
		liste.add(20);
		liste.add(8);
		liste.add(14);
		
		System.out.println("Original Liste: ");
		System.out.println(liste);
		
		int currentNumber;
		int prevNumber;
		
		/* Setze erste Zahl der Liste als erstes sortiertes Element;
		* für jedes folgende Element der Liste bis Listenende
		* führe aus:*/
		for (int i = 0; i < liste.size(); i++) {
			
			/*Tipp: für Element der Liste an Stelle i nutze	liste.get(i)*/
			currentNumber = liste.get(i);
			
			/*merke richtige_Position als aktuelle Position des Elements*/
			
			int j = i;
			
			/*laufe von der aktuellen Position rückwärts durch bereits sortieren Teil der Liste und
			solange es Vorgängerelemente gibt, führe aus:*/
			
			while (j > 0) {
				//Vergleich mit Vorgängerelement aus sort. Liste
				prevNumber = liste.get(j-1);
				/*falls aktuelles Element > Vorgängerelement:
				* dann: stoppe den Rückwärtslauf für dieses Element*/
				if (currentNumber > prevNumber) {
					break;
				}
				
				/*sonst: ersetze richtige_Position mit Position des Vorgängerelements und gehe zu nächstem Vorgängerelement*/
				j --;
			
			}
			
			//Verschiebe Element an richtige_Position
			liste.add (j,liste.remove(i));
		}
		System.out.println("Sortierte Liste: ");
		System.out.println(liste);
	}

}
