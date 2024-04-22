package lab1;

import java.util.HashSet; //Import HashSet

public class MainSet {
	
  public static void main(String[] args) {    
    
    //Namen als Set
    HashSet<String> setNamen = new HashSet<String>();

    // Namen hinzufügen
    setNamen.add("Peter");
    setNamen.add("Anja");
    setNamen.add("Tanja");
    setNamen.add("Klaus");
    setNamen.add("Wilhelm");
    
	System.out.println("Set an Namen:");
    System.out.println(setNamen);
	System.out.println("\nGroesse des Sets:");
    System.out.println(setNamen.size());

	//Hinzufügen eines neuen Elements: 
    setNamen.add("Beate");
	System.out.println("\n\nBeate hinzugefuegt:");
    System.out.println(setNamen);
	System.out.println("\nGroesse des Sets:");
	System.out.println(setNamen.size());
	
	//Bereits bestehendes Element hinzufügen und prüfen, ob sich 
	//die Groesse des Sets ändert 
    setNamen.add("Wilhelm");
	System.out.println("\n\nWilhelm erneut hinzugefuegt:");
    System.out.println(setNamen);
	System.out.println("\nGroesse des Sets:");
	System.out.println(setNamen.size());

	//Elemente suchen: 
	System.out.println("\n\nSuche nach 'Peter' im Set ergibt:");
    System.out.println(setNamen.contains("Peter"));
	System.out.println("\n\nSuche nach 'Maria' im Set ergibt:");
    System.out.println(setNamen.contains("Maria"));
    
    //Union oder Vereinigung 

     HashSet<Integer> set1 = new HashSet<Integer>();
     // Elemente zu set1 hinzufügen
     set1.add(12345);
     set1.add(67890);
     set1.add(46183);

     HashSet<Integer> set2 = new HashSet<Integer>();
     // Elemente zu set2 hinzufügen
     set2.add(12345);
     set2.add(93167);
     set2.add(63749);

     // Union der beiden Sets erstellen
     HashSet<Integer> union = new HashSet<Integer>(set1);
     union.addAll(set2);

     // Ergebnis ausgeben
     System.out.println("\n\nSet1: " + set1);
     System.out.println("\nSet2: " + set2);
     System.out.println("\nUnion Set1 und Set1: " + union);  
     
     HashSet<Integer> schnittmenge = new HashSet<Integer>(set1);
     schnittmenge.retainAll(set2);

     // Ergebnis ausgeben
     System.out.println("\nSchnittmenge Set1 und Set2: " + schnittmenge);
  
  }
}

