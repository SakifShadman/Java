package OOPConceptPart2;

public class TestCar {

    public static void main(String[] args) {

        //static polymorphism -- compile-time polymorphism
        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();
        b.engine();

        System.out.println("******");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();

        System.out.println("******");

        //Top Casting
        Car c1 = new BMW(); //chile class object can be referred by parent class reference variable -- dynamic polymorphism --> Run-time polymorphism
        c1.start();
        c1.stop();
        c1.refuel();
        c1.engine();


        //Down Casting
        //BMW b1 = (BMW) new Car(); //ClassCastException -- parents class can not cast downgrade to child class
    }
}
