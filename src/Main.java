public class Main {

    public static void main(String[] args) {

        User user = new User();

        ICalculator calc1 = new CalculatorA();
        ICalculator calc2 = new CalculatorB();
        user.setCalculator();
        System.out.println("5+3 = " + user.sum(5,3));
        System.out.println("5*3 = " + user.mult(5,3));
        user.setCalculator();
        System.out.println("5+3 = " + user.sum(5,3));
        System.out.println("5*3 = " + user.mult(5,3));



        /*
        4- FELADAT: A type a gránit lesz ezért azt kell kiírnia.
         */
    }
}
