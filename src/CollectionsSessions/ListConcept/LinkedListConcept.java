package CollectionsSessions.ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        //add:
        ll.add("test");
        ll.add("qtp");
        ll.add("selenium");
        ll.add("RPA");
        ll.add("RFT");

        //print:
        System.out.println("Content of LinkedList: " + ll);

        //addfirst:
        ll.addFirst("Sakif");

        //addlast
        ll.addLast("Shadman");
        System.out.println("Content of LinkedList: " + ll);

        //get:
        System.out.println(ll.get(0));

        //set:
        System.out.println(ll.set(0, "Arnob"));
        System.out.println(ll.get(0));
        System.out.println("Content of LinkedList: " + ll);

        //remove first and last element:
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Content of LinkedList: " + ll);

        ll.remove(2); //remove particular index
        System.out.println("Content of LinkedList: " + ll);

        //how to print all the values of LinkedList:
        //for loop
        System.out.println("*****using for loop");
        for (int i=0; i<ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        //for each loop
        System.out.println("*****using for each loop");
        for (String str : ll) {
            System.out.println(str);
        }

        //iterator
        System.out.println("*****using iterator");
        Iterator<String> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //while loop
        System.out.println("*****using while loop");
        int num=0;
        while (ll.size()>num) {
            System.out.println(ll.get(num));
            num++;
        }
    }
}