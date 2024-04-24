package labore;

import static java.util.Arrays.asList;

import java.util.ArrayList;

public class BubbleSort_Laborcode {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>
		(asList(4, 1, 3, 2, 30, 0, 5));

		System.out.println("Original Liste: ");
		System.out.println(liste);

		//Maximal so viele Durchläufe wie Liste Elemente hat 
		int durchlauf_nr = liste.size()-1;
		
		//Variable zum merken, ob noch Vertauschungen aufgetreten sind
		//wird als "wahr" initialisiert 
		boolean swapped = true;

		//Solange noch Durchläufe übrig sind und Vertauschungen aufgetreten sind 
		//setze Merker zu Vertauschungen auf "Falsch" zurück und...
		while (durchlauf_nr > ? && swapped == ?) {
			swapped = ?;

			//...laufe durch die Liste, bis dahin wo noch Vertauschungen auftreten können 
			//und vertausche Elemente, falls Links größer als Rechts, setze Merker 
			for (int swap_index = ?; swap_index <= ?; swap_index++) {

				if (liste.get(?) > liste.get(?)) {
					liste.add(?, liste.remove(?));
					swapped = ?;
				}
			}
			durchlauf_nr--;	
		}
		System.out.println("Sortierte Liste: ");
		System.out.println(liste);

	}
}
