package fst;
import java.util.*;

public class Activity10 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Avik");
        hs.add("Not Avik");
        hs.add("Definitely not");
        hs.add("Hopefully");
        hs.add("plLease");
        hs.add("One more");

        System.out.println("Size of HashSet: " + hs.size());

        hs.remove("Not Avik");
        System.out.println("Removed 'Not Avik'.");

        hs.remove("Somthing Something");
        System.out.println("Tried to remove 'Something Something'.");

        System.out.println("Is 'Avik' in the set: " + hs.contains("Avik"));
        System.out.println("Is 'Not Avik' in the set: " + hs.contains("Not Avik"));

        System.out.println("Updated HashSet: " + hs);
    }
}