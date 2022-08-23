package JavaBasics;

public class LoopsConcept {

    public static void main(String[] args) {

        //1. while loop:
        //dis-advantage of while loop: it will generate infinite loop if you do not give incremental/decremental part
        //print 1 to 10
        int i = 1; //initialization
        while (i <= 10) { //conditional
            System.out.println(i);
            i++; //incremental/decremental
        }

        System.out.println("********");

        //2. for loop:
        //print 1 to 10
        //j++ means j = j + 1
        for (int j = 1; j <= 10; j++) { //initialization, conditional, incremental
            System.out.println(j);
        }

        System.out.println("********");

        //print 10 to 1
        // 10 9 8 7 6 5 4 3 2 1
        for (int k = 10; k >= 1; k--) { //initialization, conditional, decremental
            System.out.println(k);
        }

        System.out.println("********");

        //print 10 to -10
        // -1 > -10 true
        // 1 > 10 false
        for (int k = 10; k >= -10; k--) { //initialization, conditional, decremental
            System.out.println(k);
        }
    }
}