package CollectionsSessions.ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {

        int a[] = new int[3]; //static array -- size os fixed

        //dynamic array -- ArrayList
        //1. can contain duplicate values/elements
        //2. maintains insertion order
        //3. Synchronized
        //4. allows random access to fetch the element because it stores the values on the basis of indexes

        ArrayList ar = new ArrayList(); //non generic

        ar.add(10); //0
        ar.add(20); //1
        ar.add(30); //2

        System.out.println(ar.size());

        ar.add(40); //3
        ar.add(50); //4
        ar.add(50); //5
        ar.add("Sakif");
        ar.add(12.33);
        ar.add(true);
        ar.add('a');

        System.out.println(ar.size()); //size of ArrayList
        System.out.println(ar.get(4)); //to get the value from an index

        //to print all the values from ArrayList:
        //1. for loop
        //2. using iterator

        for(int i=0; i<ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println("****************************************");

        //non generic vs generic:

        ArrayList<Integer> ar1 = new ArrayList<>(); //generic(primitive)
        ar1.add(100);
        //ar1.add("Selenium");

        ArrayList<String> ar2 = new ArrayList<>(); //generic(non-primitive)
        ar2.add("test");
        ar2.add("selenium");


        //interview question: how to store the specified user defined class object in this particular ArrayList?
        //Employee class Objects:
        Employee e1 = new Employee("Sakif", 26, "QA");
        Employee e2 = new Employee("Shadman", 20, "Racer");
        Employee e3 = new Employee("Arnob", 29, "Owner");

        //create ArrayList:
        ArrayList<Employee> ar3 = new ArrayList<>(); //generic(class object)
        ar3.add(e1);
        ar3.add(e2);
        ar3.add(e3);

        //iterator to traverse the values:
        Iterator<Employee> it = ar3.iterator();
        while(it.hasNext()) {
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

        System.out.println("****************************************");
        //****************************************

        //addAll(): added one ArrayList to another
        ArrayList<String> ar4 = new ArrayList<>();
        ar4.add("test");
        ar4.add("selenium");
        ar4.add("QTP");

        ArrayList<String> ar5 = new ArrayList<>();
        ar5.add("dev");
        ar5.add("Java");
        ar5.add("JavaScript");

        ar4.addAll(ar5);

        for(int i=0; i<ar4.size(); i++) {
            System.out.println(ar4.get(i));
        }
        System.out.println("****************************************");


        //removeAll(): remove everything from added ArrayList
        ar4.removeAll(ar5);
        for(int i = 0; i< ar4.size(); i++) {
            System.out.println(ar4.get(i));
        }
        System.out.println("****************************************");


        //retainAll(): print only common values
        ArrayList<String> ar6 = new ArrayList<>();
        ar6.add("test");
        ar6.add("selenium");
        ar6.add("QTP");

        ArrayList<String> ar7 = new ArrayList<>();
        ar7.add("test");
        ar7.add("Java");

        ar6.retainAll(ar7);
        for(int i=0; i< ar6.size(); i++) {
            System.out.println(ar6.get(i));
        }
    }
}