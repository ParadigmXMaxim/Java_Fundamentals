package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
import java.util.ArrayList;
public class Exercise_03 {
    public static void main(String[] args){
        try{
            ArrayList<Integer> years = new ArrayList<Integer>();
            years.add(1989);
            years.add(1951);
            years.add(1921);

            for(Integer year : years){
                System.out.println(year);
            }

            years.remove(5);
            for(Integer year : years){
                System.out.println(year);
            }
        }catch(IndexOutOfBoundsException ioe){
            System.out.println("You tried to access an index that does not exist.");
            System.out.println(ioe.getMessage());
        }finally{
            System.out.println("E Pluribus Unum");
        }

    }
}