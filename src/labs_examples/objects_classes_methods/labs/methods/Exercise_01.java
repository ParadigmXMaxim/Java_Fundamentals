package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("Calling Multiply Method:");
        System.out.println("9 * 7 = " + multiply(9,7));
        System.out.println();
        System.out.println("Calling Divide Method:");
        System.out.println("49 / 7 = " + divide(49,7));
        System.out.println();
        System.out.println("Calling Joke Method:");
        joke();
        System.out.println();
        System.out.println("Calling Years Method:");
        System.out.println("9 years = " + years(9) + " seconds");
        System.out.println();
        System.out.println("Calling Age Method:");
        int[] age = {7, 31, 43, 56, 32};
        System.out.println("The length of your array is " + ages(age));

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static double multiply(int a, int b){
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static double divide(int a, int b){
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("What do you see in me?");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int years(int yr){
        int secondsInDay = 24 * 60 * 60;
        return secondsInDay * 365;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int ages(int[] age){
        return age.length;
    }





}
