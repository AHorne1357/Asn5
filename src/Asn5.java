//Austin Horne

import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        //Create two array lists
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        //Add items
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        scores.add(85);
        scores.add(90);
        scores.add(78);
        scores.add(92);

        //Display initial contents
        System.out.println("INITIAL LISTS");

        System.out.println("Fruits List (Using Basic For Loop):");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }

        System.out.println("\nScores List (Using Enhanced For-Each Loop):");
        for (Integer score : scores) {
            System.out.println("Score: " + score);
        }


        fruits.set(1, "Blueberry"); // Replaces "Banana" at index 1
        scores.remove(2);           // Removes the item at index 2 (78)

        System.out.println("\nLISTS AFTER OPERATIONS");

        System.out.println("Fruits List After .set() (Using forEach method):");
        fruits.forEach(fruit -> System.out.println("Fruit: " + fruit));

        System.out.println("\nScores List After .remove() (Using Basic For Loop):");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Index " + i + ": " + scores.get(i));
        }
    }
}