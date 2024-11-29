/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_concepts_and_data_structures;

import java.util.*;


/**
 *
 * @author tapas
 */
public class LibrarySystem {

    public static void main(String[] args) {
        // ArrayList for storing books
        List<String> books = new ArrayList<>();
        books.add("The Great Gatsby");
        books.add("1984");
        books.add(1, ""); 

        // LinkedList for maintaining a history of borrowed books
        LinkedList<String> borrowedBooksHistory = new LinkedList<>();
        borrowedBooksHistory.add("Moby Dick");
        borrowedBooksHistory.add("To Kill a Mockingbird");
//        Book 4 -> Book1 -> Book2 -> Book3
        

        // HashSet for storing unique member IDs
        Set<Integer> memberIds = new HashSet<>();
        // [0,1              ]
        memberIds.add(101); // -> 0
        memberIds.add(102); // -> 1
        memberIds.add(102); // -> 1
        memberIds.add(103); 
        memberIds.add(104);
        memberIds.add(106);
        System.out.println(memberIds);
        memberIds.contains(104);
        

//         TreeSet for storing sorted book titles
        Set<String> sortedBooks = new TreeSet<>(books);

        // HashMap for mapping book titles to their availability status
        Map<String, Boolean> bookAvailability = new HashMap<>();
//        "key" -> "value"
        bookAvailability.put("The Great Gatsby", true);
        bookAvailability.put("Book 2", true);
        
        // TreeMap for storing members sorted by their ID
        Map<Integer, String> sortedMembers = new TreeMap<>();
        sortedMembers.put(101, "Alice");
        sortedMembers.put(102, "Bob");
        
        
        // Stack for storing recently returned books
        Stack<String> returnedBooks = new Stack<>();
        returnedBooks.add("Book1");
        returnedBooks.add("Book2");
        returnedBooks.pop();
//       Book 3 | Book 2 | Book 1   -> LIFO 

//        Alice - Bob
//        Alice - Bob ->
        // Queue for managing a queue of members waiting for a book
        // Book 1 | Book 2 | Book 3 -> FIFO
        Queue<String> memberQueue = new LinkedList<>();
        memberQueue.add("Alice");
        memberQueue.add("Bob");
        memberQueue.poll();
        
         // Example usage of collections...
        
         // Displaying all collections:
//         System.out.println("Books: " + books);
//         System.out.println("Borrowed Books History: " + borrowedBooksHistory);
//         System.out.println("Member Queue: " + memberQueue);
//         System.out.println("Member IDs: " + memberIds);
//         System.out.println("Sorted Books: " + sortedBooks);
//         System.out.println("Book Availability: " + bookAvailability);
//         System.out.println("Sorted Members by ID: " + sortedMembers);
//         System.out.println("Returned Books Stack: " + returnedBooks);
     }
}
