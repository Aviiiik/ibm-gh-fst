package fst;
import java.util.*;

public class Activity9 {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Avik");
        myList.add("Not Avik");
        myList.add("Definitely not");
        myList.add("Hopefully");
        myList.add("plLease");

        for (String s : myList) {
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is the word in the array: " + myList.contains("Avik"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("Not Avik");
    }
}