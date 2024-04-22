package lab2;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;


public class myShopReviews {

    // Methode zur Hinzufügung einer Kundenbewertung
    public static void addReview1(HashMap<String, ArrayList<Integer>> reviews, String product, int rating) {
        
    	// Wenn in reviews nicht schon das produkt ist, füge es hinzu 
    	if (!reviews.containsKey(product)) {
            reviews.put(product, new ArrayList<>());
        }
    	
    	// Füge dem Produkt ein rating hinzu 
        reviews.get(product).add(rating);
    }

    // Methode zur Berechnung der durchschnittlichen Bewertung für ein Produkt
    public static double averageRatings(HashMap<String, ArrayList<Integer>> reviews, String product) {
    	
    	// Sammlung aller bewertungs int der produkte in arraylist
        ArrayList<Integer> productReviews = reviews.get(product);

        // Alle bewertungen werden addiert 
        int sum = 0;
        for (int rating : productReviews) {
            sum += rating;
        }
        
        // Durchschnitt wird zurückgegeben 
        return (double) sum / productReviews.size();
    }

    public static void main(String[] args) {
        
        HashMap<String, ArrayList<Integer>> reviews = new HashMap<>();

        // Reviews werden angelegt mit der addReview1 methode (+print)
        addReview1(reviews, "Laptop", 5);
        addReview1(reviews, "Laptop", 4);
        addReview1(reviews, "Smartphone", 4);
        addReview1(reviews, "Smartphone", 2);
        addReview1(reviews, "Smartphone", 3);
        addReview1(reviews, "Flatscreen-TV", 3);
        addReview1(reviews, "flatscreen-TV", 2); // Hinzugefuegt

        System.out.println("Produktbewertungen: " + reviews);
        
        // Anlegen eines String - Hashsets mit den Durchschnittsbewert. aller Produkte. (+print Produktliste)
        // HashSet<String> products = new HashSet<String>(reviews.keySet());
        // System.out.println("\nProduktliste: " + products + '\n');	

        // Ausgabe der Durchschnittsbewertung 
        for (String product : reviews.keySet()) {  
            System.out.println("Durchschnittliche Bewertung für " + product + ": " + averageRatings(reviews, product));
        }        
    }
}
