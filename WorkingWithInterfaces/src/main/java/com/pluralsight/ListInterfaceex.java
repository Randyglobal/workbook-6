package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceex {
    public static void main(String[] args) {
        // We declare it as a List, but create an ArrayList implementation
        List<String> myList = new ArrayList<>(); // Think of it as a new, empty notepad list

        System.out.println("Is list empty? " + myList.isEmpty()); // true

        // 1. Add items
        myList.add("Milk");        // Index 0
        myList.add("Eggs");        // Index 1
        myList.add("Bread");       // Index 2
        myList.add("Milk");        // Index 3 (duplicates allowed!)

        System.out.println("My shopping list: " + myList); // Output: [Milk, Eggs, Bread, Milk]
        System.out.println("Number of items: " + myList.size()); // Output: 4

        // 2. Get an item by index
        String thirdItem = myList.get(2);
        System.out.println("The third item is: " + thirdItem); // Output: Bread

        // 3. Insert an item at a specific position
        myList.add(1, "Butter"); // Add Butter at index 1, shifting Eggs, Bread, Milk
        System.out.println("List after adding Butter: " + myList); // Output: [Milk, Butter, Eggs, Bread, Milk]

        // 4. Replace an item
        myList.set(3, "Whole Wheat Bread"); // Replace item at index 3 (which was Bread)
        System.out.println("List after replacing bread: " + myList); // Output: [Milk, Butter, Eggs, Whole Wheat Bread, Milk]

        // 5. Check if an item exists
        System.out.println("Do I have Eggs on my list? " + myList.contains("Eggs")); // Output: true
        System.out.println("Where are the Eggs? Index: " + myList.indexOf("Eggs")); // Output: 2

        // 6. Remove an item
        myList.remove("Butter"); // Removes the first "Butter" found
        System.out.println("List after removing Butter: " + myList); // Output: [Milk, Eggs, Whole Wheat Bread, Milk]

        myList.remove(0); // Removes item at index 0 (Milk)
        System.out.println("List after removing item at index 0: " + myList); // Output: [Eggs, Whole Wheat Bread, Milk]

        // Iterating through a list
        System.out.println("\nItems to buy:");
        for (String item : myList) {
            System.out.println("- " + item);
        }
    }
}
