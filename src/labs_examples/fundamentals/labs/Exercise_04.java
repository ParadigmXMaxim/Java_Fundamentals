package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        byte bit = 1;
        short countries = 194;
        long ipv6 = 340_000_000_000_000_000l; //It is 340 Undecillion but I stopped short
        float pi = 3.1415f;
        double morePi = 3.14159265;
        char middleInitial = 'R';
        boolean answer = false;

        System.out.println("Byte bit is: " + bit);
        System.out.println("Short countries is: " + countries);
        System.out.println("long ipv6 is: " + ipv6);
        System.out.println("float pi is: " + pi);
        System.out.println("Double morePi is: " + morePi);
        System.out.println("Char middleInitial is: " + middleInitial);
        System.out.println("Boolean answer is: " + answer);


    }

}
