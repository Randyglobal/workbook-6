package com.pluralsight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add( new Person("Randy", "Imbia", 11));
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );
        // Same last name as Alice
        myFamily.add(new Person("David", "Smith", 40));
        // Same first and last name as Alice, but different age
        myFamily.add(new Person("Alice", "Smith", 28));
        myFamily.add(new Person("Alice", "Smith", 35));

//        Before any sorting happens, you want to see what your myFamily list looks like.
//        This confirms that the objects are in the order they were added
        System.out.println("Before Sorting (Comparable):");
        myFamily.forEach(System.out::println);

//        comparing single points
//        Collections.sort(myFamily);

//        comparing multiple points
        Comparator<Person> custonSorter = Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getAge);
        myFamily.sort(custonSorter);
//        After sorting by last name
        System.out.println("\nAfter Sorting by lastName (Comparable):");
        myFamily.forEach(System.out::println);
    }
}
