package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */
import java.util.ArrayList;
public class Exercise_02{

    public Exercise_02(){

    }

    public <E extends Number, T extends E> E sum(ArrayList<E> arr){
        T total = null;

        for(E value : arr){
            System.out.println(value);

        }
        return total;
    }

    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(45.6);
        list.add(67.2);
        list.add(17.9);
        list.add(61.6);
        list.add(98.54);

        Exercise_02 ex = new Exercise_02();
        ex.sum(list);
    }


}