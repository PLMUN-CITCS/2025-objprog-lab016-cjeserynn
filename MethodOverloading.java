public class MethodOverloading {

    // First method: Overloaded with an integer parameter
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second method: Overloaded with a double parameter
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third method: Overloaded with a string parameter
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }

    // Main method
    public static void main(String[] args) {
        // Calling the overloaded methods
        printValue(10);        // Calls the int version
        printValue(3.14);      // Calls the double version
        printValue("Hello!");  // Calls the string version
    }
}
