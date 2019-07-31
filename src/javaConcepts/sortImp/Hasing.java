package javaConcepts.sortImp;

/**
 * Created by asee2278 on 2/4/17.
 */


// we have category
// 101 - java
// 102 - javascript
//103 - golang

import java.util.*;

class Book {

    int id, quantity, category;
    String name, author;

    public Book(int id, String name, String author, Integer category, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        return category;
    }


    public void feed(Map<Integer, List<Book>> simulatedHashMap) {
        autoCreate(simulatedHashMap);
        simulatedHashMap.get(this.hashCode()).add(this);
    }


    public void autoCreate(Map<Integer, List<Book>> simulatedHashMap){
        if( simulatedHashMap.get(this.hashCode()) == null){
            simulatedHashMap.put(this.hashCode(), new ArrayList<Book>());
        }

    }

}

public class Hasing {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer, Book> map = new Hashtable<Integer, Book>();
//        List<Book> listJava = new ArrayList<Book>();
//        List<Book> listJavaScrip = new ArrayList<Book>();
//        List<Book> listgo = new ArrayList<Book>();

        Map<Integer, List<Book>> simulatedHashMap = new HashMap<Integer, List<Book>>();
//        simulatedHashMap.put(101, listJava);
//        simulatedHashMap.put(102, listJavaScrip);
//        simulatedHashMap.put(103, listgo);


        //Creating Books
        new Book(101, "Let us Java", "Yashwant Kanetkar", 101, 8).feed(simulatedHashMap);

//        simulatedHashMap.get(b1.hashCode()).add(b1);

        new Book(101, "Bile of java", "Yashwant Kanetkar", 101, 8).feed(simulatedHashMap);
//        simulatedHashMap.get(b1.hashCode()).add(b5);

        new Book(101, "From 0 to Hero in Java", "Yashwant Kanetkar", 101, 8).feed(simulatedHashMap);
//        simulatedHashMap.get(b1.hashCode()).add(b8);

        new Book(101, "Let us Javascript", "Yashwant Kanetkar", 102, 8).feed(simulatedHashMap);
//        simulatedHashMap.get(b1.hashCode()).add(b3);

        new Book(101, "Bile of javascript", "Yashwant Kanetkar", 102, 8).feed(simulatedHashMap);
//        simulatedHashMap.get(b1.hashCode()).add(b6);

        new Book(101, "Let us Go", "Yashwant Kanetkar", 103, 8).feed(simulatedHashMap);
//        simulatedHashMap.get(b1.hashCode()).add(b2);

        new Book(101, "Bile of Golang", "Yashwant Kanetkar", 103, 8).feed(simulatedHashMap);
//        simulatedHashMap.get(b1.hashCode()).add(b4);

        new Book(101, "From 0 to Hero in javascript", "Yashwant Kanetkar", 102, 8).feed(simulatedHashMap);
//        simulatedHashMap.get(b1.hashCode()).add(b7);


        List<Book> returnBookList = null;


        Set<Integer> bookCategories = simulatedHashMap.keySet();

        for (Integer category : bookCategories) {
            System.out.print("Printing books for Category " + category);
            returnBookList = simulatedHashMap.get(category);
            for (Book b : returnBookList) {
                System.out.println(" " + b.name + " " + b.author + "  " + b.quantity + " " + b.hashCode());
            }
            System.out.println();
        }

//
//        List<Integer> returnList= simulatedHashMap.entrySet();
//
//        for( Book b : returnList){
//            System.out.println(" "+b.name+" "+b.author+"  "+b.quantity + " " + b.hashCode());
//        }
//
//        returnList= simulatedHashMap.get(102);
//        System.out.println();
//        for( Book b : returnList){
//
//            System.out.println(b.id+" "+b.name+" "+b.author+"  "+b.quantity + " " + b.hashCode());
//        }
//
//        returnList= simulatedHashMap.get(103);
//        System.out.print("\n");
//        for( Book b : returnList){
//            System.out.println(b.id+" "+b.name+" "+b.author+"  "+b.quantity + " " + b.hashCode());
//        }


    }
}