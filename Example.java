public class Example {

    public static int storedNumber;
    private static String storedString = "";

    public Example() {
        storedNumber = 0;
        storedString += "a";
    }

    public static String getStoredString() {
        return storedString;
    }
}