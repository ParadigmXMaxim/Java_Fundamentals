package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args){
        for(int x = 0; x <= 20; x++){
            if(x % 2 == 0){
                System.out.println(x + " is a even number");
            }else{
                continue;
            }
        }
    }
}
