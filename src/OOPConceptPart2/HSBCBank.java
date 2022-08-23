package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { //we are achieving multiple inheritance
    //Is-a relationship

    //If a class is implementing any Interface, then it's mandatory to define/override all the methods of Interface.
    //overriding from USBank
    public void credit() {
        System.out.println("hsbc--credit");
    }

    @Override
    public void debit() {
        System.out.println("hsbc--debit");
    }

    @Override
    public void transferMoney() {
        System.out.println("hsbc--transferMoney");
    }

    //separate methods of HSBCBank class
    public void educationLoan() {
        System.out.println("hsbc--educationLoan");
    }

    public void carLoan() {
        System.out.println("hsbc--carLoan");
    }

    //overriding from BrazilBank
    @Override
    public void mutualFund() {
        System.out.println("hsbc--mutualFund");
    }
}