package lab1;

import java.util.HashMap; //Import HashMap

public class MainMap {

	  public static void main(String[] args) {
	    	    
	    // HashMap mit MatrNr und Name
	    HashMap<Integer, String> NameMatrNrHash = new HashMap<Integer, String>();

	    // MatrNr und Namen hinzufügen
	    NameMatrNrHash.put(12345, "Peter");
	    NameMatrNrHash.put(67890, "Anja");
	    NameMatrNrHash.put(46183, "Klaus");
	    NameMatrNrHash.put(93167, "Wilhelm");
	    NameMatrNrHash.put(46183, "Peter");
	    
	    
		System.out.println("Verzeichnis fuer MatrNr und Namen:");
	    System.out.println(NameMatrNrHash);
	    
	    //Gleichen Key mit neuem Value einfügen:
	    NameMatrNrHash.put(93167, "Alexander");

		System.out.println("\n\nNeuer Name zugeordnet zuMatrNr:");
	    System.out.println(NameMatrNrHash);

	    
	    //Ein Key-Value Paar löschen 
	    String a;
	    a = NameMatrNrHash.remove(67890);
	    
		System.out.println("\n\nStudent mit MatrNr 67890 geloescht:");
	    System.out.println(a);
	    
	    System.out.println("\n\nAktuelles Verzeichnis");
	    System.out.println(NameMatrNrHash);
	    
	    //Nach Einträgen suchen (Key oder Value) 
	    System.out.println("\n\nSuche nach Key 67890:");
	    System.out.println(NameMatrNrHash.containsKey(67890));
	    System.out.println("\n\nSuche nach Value 'Klaus':");
	    System.out.println(NameMatrNrHash.containsValue("Klaus"));
	    
	  }
}
