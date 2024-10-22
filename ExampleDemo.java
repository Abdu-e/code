public class ExampleDemo {

    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example();
        ex1.storedNumber = 5;
        Example ex3 = new Example();
        ex2.storedNumber = 2;

        System.out.println(ex3.getStoredString());
        System.out.println(ex3.storedNumber);
    }
}