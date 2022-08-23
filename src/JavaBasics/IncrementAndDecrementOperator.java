package JavaBasics;

public class IncrementAndDecrementOperator {

    public static void main(String[] args) {

        //++ increment
        //-- decrement

        int i = 1;
        int j = i++; //post increment: increase the value of i later first give the value to j
        System.out.println(i);
        System.out.println(j);

        int a = 1;
        int b = ++a; //pre increment: increase the value of a first then give it to b too
        System.out.println(a);
        System.out.println(b);

        int m = 2;
        int n = m--; //post decrement: first give the value to n then decrease the value of m
        System.out.println(m);
        System.out.println(n);

        int p = 2;
        int q = --p; //pre decrement: decrease the value of p by 1 so (p=1) then also give it to q
        System.out.println(p);
        System.out.println(q);

    }
}
