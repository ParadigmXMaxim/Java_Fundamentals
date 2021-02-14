package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */
public class Exercise_06 {
    public static void main(String[] args){
        try{
            information();
        }catch(Exception e){
            System.out.println("You exceeded the scope of the array");
        }
    }

    public static void information() throws IndexOutOfBoundsException{
        try{
            String[] recipe = details();
            for(String ingredient : recipe){
                System.out.println(ingredient);
            }
        }catch(IndexOutOfBoundsException ioe){
            throw new IndexOutOfBoundsException();
        }
    }

    public static String[] details() throws IndexOutOfBoundsException{
        try{
            String[] recipe = {"1 Cup of pancake batter", "2 Eggs", "1 tbs of Vanilla Extract", "1 Cup of Almond Milk", "1 tbsp of Cinnamon"};
            for(int x = 0; x < 7; x++){
                System.out.println(recipe[x]);
            }
            return recipe;
        }catch(IndexOutOfBoundsException ioe){
            System.out.println("Index " + ioe.getMessage() + " is out of scope");
            throw new IndexOutOfBoundsException();
        }
    }
}
