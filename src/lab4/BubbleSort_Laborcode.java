package lab4;

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
		while (durchlauf_nr > 0 && swapped == true) {
			swapped = false;

			//...laufe durch die Liste, bis dahin wo noch Vertauschungen auftreten können 
			//und vertausche Elemente, falls Links größer als Rechts, setze Merker 
			for (int swap_index = 0; swap_index <= durchlauf_nr; swap_index++) {

				if (liste.get(swap_index) > liste.get(durchlauf_nr)) {  //Links größer als rechts?
					liste.add(swap_index, liste.remove(durchlauf_nr));  //tauschen 
					swapped = true;
				}
			}
			durchlauf_nr--;	
		}
		System.out.println("Sortierte Liste: ");
		System.out.println(liste);

	}
}
